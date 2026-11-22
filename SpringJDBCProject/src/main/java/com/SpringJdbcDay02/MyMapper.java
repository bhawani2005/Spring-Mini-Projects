package com.SpringJdbcDay02;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyMapper implements RowMapper<ProductBo> {

	@Override
	public ProductBo mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductBo product = new ProductBo();
		
		product.setProductId(rs.getInt(1));
		product.setProductName(rs.getString(2));
		product.setPrice(rs.getDouble(3));
		product.setQuantity(rs.getInt(4));
		
		return product;
	}

}
