package com.SpringJdbcLabTask01;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyBookMapper implements RowMapper<BookBo> {

	@Override
	public BookBo mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookBo book = new BookBo();
		book.setBookId(rs.getInt(1));
		book.setBookName(rs.getString(2));
		book.setAuthor(rs.getString(3));
		book.setPrice(rs.getDouble(4));
		
		return book;
	}

}
