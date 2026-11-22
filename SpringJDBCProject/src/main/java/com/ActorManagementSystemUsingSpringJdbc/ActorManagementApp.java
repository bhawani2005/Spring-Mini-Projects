package com.ActorManagementSystemUsingSpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActorManagementApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ActorConfig.class);
		
		ActorDao bean = context.getBean("actorDao", ActorDao.class);
		
		ActorBo bo = new ActorBo();
		bo.setId(102);
		bo.setName("Amitab Bucchan");
		bo.setEmail("bucchan19@gmail.com");
		bo.setSalary(10000000);
		bo.setMovie("Sole");
		
//		int insertBook = bean.insertBook(bo);
//		if (insertBook > 0) {
//			System.out.println("Inserted Successfully.");
//		}
		
	
//		int updateActor = bean.updateActor(100000.0,"Sole" , 102);
//		if (updateActor > 0) {
//			System.out.println("Update Successfully.");
//		}
		
//		bean.selectActor().forEach(System.out::println);
		
//		ActorBo selectActorById = bean.selectActorById(102);
//		System.out.println(selectActorById);
		
		int deleteActor = bean.deleteActor(102);
		if (deleteActor > 0) {
			System.out.println("Delete Successfully.");
		}
		
	}
}
