package com.SpringJdbcDay02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	public static final String QUERY_FOR_PRODUCT_BYID = "SELECT PRODUCT_ID, PRODUCT_NAME, PRICE, QUANTITY FROM PRODUCT WHERE PRODUCT_ID = ?";
	public static final String QUERY_FOR_ALL_PRODUCT = "SELECT * FROM PRODUCT";

	JdbcTemplate template;

	@Autowired
	public ProductDao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public String toString() {
		return "ProductDao [template=" + template + "]";
	}

	public ProductBo getProductById(int productId) {
		return template.queryForObject(QUERY_FOR_PRODUCT_BYID, new MyMapper(), productId);
	}

	public List<ProductBo> getAllProduct() {
		return template.query(QUERY_FOR_ALL_PRODUCT, (rs, row) -> {
			ProductBo product = new ProductBo();
			product.setProductId(rs.getInt(1));
			product.setProductName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			product.setQuantity(rs.getInt(4));
			return product;
		});

	}

}
