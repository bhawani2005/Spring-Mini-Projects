package com.nit;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class BankingApplication {
	private static Logger logger = Logger.getLogger(BankingApplication.class.getName());
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		FileHandler fileHandler = new FileHandler("application.log", true);
		
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fileHandler);
		
		
		logger.setLevel(Level.CONFIG);
		
		logger.info("Application started");
		
		int balance = 5000;
		int withdrawBalance = 12000;
		
		if(withdrawBalance<=balance) {
			balance -= withdrawBalance;
			logger.info("Current Balance : "+balance);
			logger.config("Config");
		}
		else {
			logger.warning("Insufficent balance");
			logger.severe("Some error");
		}
		logger.fine("detail debbug");
		logger.finer("more detail debbug");
		logger.finest("Extream details debbug");
		logger.info("Execution completed...");
		
		System.out.println("File Location as : "+new File("application.log").getAbsolutePath());
	}
}
