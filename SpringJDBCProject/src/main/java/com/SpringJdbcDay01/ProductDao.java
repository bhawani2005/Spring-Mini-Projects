package com.SpringJdbcDay01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("product")
public class ProductDao {
	private final String QUERY_FOR_PRODUCT_COUNT = "SELECT COUNT(1) FROM PRODUCT";
	private final String QUERY_FOR_PRODUCT_NAME_BY_ID = "SELECT PRODUCT_NAME FROM PRODUCT WHERE PRODUCT_ID = ?";
	private JdbcTemplate template;

	@Value("${productId}")
	private Integer productId;

	@Autowired
	public ProductDao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public String toString() {
		return "ProductDao [template=" + template + "]";
	}

	public int getProductCount() {
		return template.queryForObject(QUERY_FOR_PRODUCT_COUNT, Integer.class);
	}

	public String getProductNameById() {
		return template.queryForObject(QUERY_FOR_PRODUCT_NAME_BY_ID, String.class, productId);
	}
}
