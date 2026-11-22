package com.order;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.OrderInfo;

public class App 
{
	public static void main( String[] args )
    {
        Configuration cnf = new Configuration();
        cnf.configure("com/order/hibernate-cnf.xml");
        
        SessionFactory factory = cnf.buildSessionFactory();
        System.out.println(factory);
        
//        OrderInfo order = new OrderInfo();
//        order.setOrderId(102);
//        order.setCustomerName("Ankit");
//        order.setCustomerNumber(8869532416l);
//        order.setFoodName("Vag Biriyani");
//        order.setFoodPrice(180);
//        order.setFoodQuantity(1);
//        order.setRestaurantName("Mahfil");
//        order.setPaymentOption("Cash on Delivery");
//        order.setDeliveryAddress("UrbenStay PG, Ammerpet, Hyderabad");
//        order.setStatus("Order Placed");
//        order.setTotalAmount((order.getFoodPrice()*order.getFoodQuantity())+50);
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        //session.persist(order);
        transaction.commit();
        session.close();
        
        
        Session session2 = factory.openSession();
        OrderInfo info = session2.get(OrderInfo.class, 102);
        System.out.println(info);
        session2.close();
        
        
        
    }
}
