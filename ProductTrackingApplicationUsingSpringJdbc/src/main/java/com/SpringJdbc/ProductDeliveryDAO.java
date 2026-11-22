package com.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("product")
public class ProductDeliveryDAO {

	private static final String QUERY_FOR_PRICE_BY_NAME = "select price from productDelivery where productName = ?";
	private static final String QUERY_FOR_ALL_PRODUCT = "select productName, ShippingAdd, price, quantity, placeddate from productDelivery";
	private static final String QUERY_FOR_INSERT ="INSERT INTO productDelivery (productName, ShippingAdd, price, quantity, placeddate) VALUES (?, ?, ?, ?, ?)";	
	private static final String QUERY_FOR_DELETE_BY_NAME = "delete from productDelivery where productName = ?";
	private static final String QUERY_FOR_UPDATE_SHIPPING_ADDRESS_AND_PLACEDDATE_BY_NAME = "update productDelivery set SHIPPINGADD = ?, PLACEDDATE = ? where productName = ?";
	private static final String QUERY_FOR_COUNT_PRODUCT_BY_NAME = "select count(*) from productDelivery where productname = ?";
	private static final String QUERY_FOR_PRODUCT_BY_SHIPPING_ADDRESS = "select * from productDelivery where shippingAdd = ?";

	private JdbcTemplate template;

	@Autowired
	public ProductDeliveryDAO(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public List<Double> getProductPriceByName(String name) {
		return template.query(QUERY_FOR_PRICE_BY_NAME, new Object[] { name }, (rs, row) -> {
//			  ProductDelivery product=new ProductDelivery();
//			   product.setProductPrice(rs.getDouble(1));
//			   return product; //{if we store this way and return product then other values are null because of that we only return Integer.}

			Double price = rs.getDouble(1);
			return price;
		});
	}

	public List<ProductDelivery> getAllProduct() {
		return template.query(QUERY_FOR_ALL_PRODUCT, (rs, row) -> {
			ProductDelivery product = new ProductDelivery();
			product.setProductName(rs.getString(1));
			product.setProductShippingAddress(rs.getString(2));
			product.setProductPrice(rs.getDouble(3));
			product.setProductQuantity(rs.getInt(4));
			product.setProductPlaceDate(rs.getString(5));

			return product;
		});
	}

	public int insertProductDetails(ProductDelivery product) {
		return template.update(QUERY_FOR_INSERT,
				new Object[] { product.getProductName(), product.getProductShippingAddress(), product.getProductPrice(),
						product.getProductQuantity(), product.getProductPlaceDate() });
	}

	public int deleteProductDetails(String productName) {
		return template.update(QUERY_FOR_DELETE_BY_NAME, new Object[] { productName });
	}

	public int updateProductDetails(String shippingAdd, String placedDate, String productName) {
		return template.update(QUERY_FOR_UPDATE_SHIPPING_ADDRESS_AND_PLACEDDATE_BY_NAME,
				new Object[] { shippingAdd, placedDate, productName });
	}

	public int countProductByName(String productName) {
		return template.queryForObject(QUERY_FOR_COUNT_PRODUCT_BY_NAME, Integer.class, new Object[] { productName });
	}
	
	public List<ProductDelivery> getProductDetailsByShippingAdd(String address) {
		return template.query(QUERY_FOR_PRODUCT_BY_SHIPPING_ADDRESS, new Object[] {address}, (rs, row)->{
			ProductDelivery product = new ProductDelivery();
			product.setProductName(rs.getString(1));
			product.setProductShippingAddress(rs.getString(2));
			product.setProductPrice(rs.getDouble(3));
			product.setProductQuantity(rs.getInt(4));
			product.setProductPlaceDate(rs.getString(5));

			return product;
		});
	}

}
