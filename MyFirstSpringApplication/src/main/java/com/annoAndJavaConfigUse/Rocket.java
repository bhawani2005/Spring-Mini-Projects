package com.annoAndJavaConfigUse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Autowired
	@Qualifier("launcher1")
	private Launcher launcher;

	static {
		System.out.println("Rocket class loaded...");
	}
	
	public Rocket() {
		System.out.println("Rocket object created...");
	}

	public void setLauncher(Launcher launcher) {
		this.launcher = launcher;
	}

	public void launch() {
		System.out.println("Launch Process Started....");
		launcher.ignite();
	}
}
