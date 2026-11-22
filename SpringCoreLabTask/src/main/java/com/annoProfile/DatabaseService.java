package com.annoProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {
	
	@Autowired
	private IDatabase database;

	public DatabaseService() {
		super();
	}

	public IDatabase getDatabase() {
		return database;
	}

	public void setDatabase(IDatabase database) {
		this.database = database;
	}
	
	public void connection() {
		database.connection();
	}
}
