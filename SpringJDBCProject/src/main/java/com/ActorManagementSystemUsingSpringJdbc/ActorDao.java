package com.ActorManagementSystemUsingSpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ActorDao {
	
	private static final String QUERY_FOR_INSERT = "insert into actor values(?,?,?,?,?)";
	private static final String QUERY_FOR_UPDATE = "update actor set actor_salary = ?, actor_movie = ? where actor_id = ?";
	private static final String QUERY_FOR_DELETE = "delete actor where actor_id = ?";
	private static final String QUERY_FOR_SELECT_ALL = "select * from actor";
	private static final String QUERY_FOR_SELECT_BY_ID = "select * from actor where actor_id = ?";

	private JdbcTemplate template;
	
	@Autowired
	public ActorDao(JdbcTemplate jdbcTemplate) {
		this.template = jdbcTemplate;
	}
	
	public int insertBook(ActorBo actor) {
		return template.update(QUERY_FOR_INSERT, new Object[] {
			actor.getId(),
			actor.getName(),
			actor.getEmail(),
			actor.getSalary(),
			actor.getMovie()
		});
	}
	
	public int updateActor(double salary, String movie, int id) {
		return template.update(QUERY_FOR_UPDATE, new Object[] {
			salary,
			movie, 
			id
		});
	}
	
	public int deleteActor(int id) {
		return template.update(QUERY_FOR_DELETE, new Object[] {
				id
		});
	}
	
	public List<ActorBo> selectActor() {
		return template.query(QUERY_FOR_SELECT_ALL, (rs, row)->{
			ActorBo actor = new ActorBo();
			actor.setId(rs.getInt(1));
			actor.setName(rs.getString(2));
			actor.setEmail(rs.getString(3));
			actor.setSalary(rs.getDouble(4));
			actor.setMovie(rs.getString(5));
			
			return actor;
		});
	}
	
	public ActorBo selectActorById(int id) {
		return template.queryForObject(QUERY_FOR_SELECT_BY_ID, new Object[] {id}, (rs, row)->{
			ActorBo actor = new ActorBo();
			actor.setId(rs.getInt(1));
			actor.setName(rs.getString(2));
			actor.setEmail(rs.getString(3));
			actor.setSalary(rs.getDouble(4));
			actor.setMovie(rs.getString(5));
			
			return actor;
		});
	}
}
