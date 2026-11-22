package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.FoodProduct;
import com.exception.MyException;
import com.repository.FoodRepository;

@Service("fs")
public class FoodService {

	@Autowired
	FoodRepository repository;

	public void storedData(FoodProduct product) {
		product.setStatus("Placed");
		repository.save(product);

		System.out.println("Food Order successfully.....");
	}

	public List<FoodProduct> getAllOrder() {
		return repository.findAll();
	}

	public FoodProduct getOrderById(int id) {
		return repository.findById(id).orElseThrow(() -> new MyException("Id NOT matched."));
	}
	
	public FoodProduct cancelOrder(int id) {
		FoodProduct product = repository.findById(id).orElseThrow(()-> new MyException("Id NOT matched."));
		product.setStatus("cancel");
		
		FoodProduct save = repository.save(product);
		
		return save;
	}
	
	public List<FoodProduct> getOrderByStatus(String str){
		return repository.findByStatus(str);
	}
	
	public long getProductCountBasedOnStatus(String status) {
		return repository.countByStatus(status);
	}
	
	public long getProductCountBasedOnStatusAndPriceRange(String status, float start, float end) {
		return repository.countByStatusAndPriceBetween(status, start, end);
	}
	
	public List<FoodProduct> getOrderByName(String name){
		return repository.getProductByOrderName(name);
	}
}
