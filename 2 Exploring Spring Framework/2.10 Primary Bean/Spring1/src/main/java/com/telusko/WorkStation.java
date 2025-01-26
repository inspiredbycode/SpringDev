package com.telusko;

import java.beans.ConstructorProperties;

/**
 * Learnings 
 * 1. While refactoring the properties,
 * a) the xml files dont get updated 
 * b) setters are getters across other files will not get updated when you refactor the property  
 */
public class WorkStation {
	
	private int id;
	private Computer com;
	
	public WorkStation() {
		//System.out.println("Object Created");
	}
	
//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}
	
	
	
	public Computer getCom() {
		return com;
	}
	
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		System.out.println("Coding");
		com.compile();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
