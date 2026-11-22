package com.annoAndJavaConfigUse;

public class Launcher {
	static {
		System.out.println("Launcher Class Loaded...");
	}
	
	public Launcher() {
		System.out.println("Launcher object Created...");
	}
	
	public void ignite() {
		System.out.println("Check Fuel Meter.");
		System.out.println("Check All Device.");
		System.out.println("Ready for Launch.");
		countDown();
	}
	
	public void countDown() {
		for(int i=5; i>0; i--) {
			System.out.println("Count :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		view();
	}
	
	public void view() {
		System.out.println("Rocket Launched Successfully.");
		System.out.println("🚀🧑‍🚀");
	}
}
