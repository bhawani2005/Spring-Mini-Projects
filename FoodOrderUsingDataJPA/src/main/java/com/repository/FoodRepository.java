package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.FoodProduct;

//@Repository
public interface FoodRepository extends JpaRepository<FoodProduct, Integer> {

	public List<FoodProduct> findByStatus(String status);

	public long countByStatus(String status);

	public long countByStatusAndPriceBetween(String status, float start, float end);

	/*
	 * i want find the product based on orderName
	 * 
	 */

	// @Query("from FoodProduct f where f.orderName like ?1")

	// if we don't have Entity class then we don't know then we write:
	@Query(value = "select * from food_order where order_name = ?", nativeQuery = true)
	public List<FoodProduct> getProductByOrderName(String name);

	/*
	 * find the product based on name and price range.
	 * 
	 */

	//@Query("from FoodProduct f where f.orderName like ?1and f.price between ?2and ?3 ")
	//It is the another way for writing a JPQL Query...
	@Query("from FoodProduct f where f.orderName like :name and f.price between ?2and ?3 ")
	public List<FoodProduct> getProductByNameAndPriceRange(@Param("name") String name, 
														float start, 
														float end);

}
