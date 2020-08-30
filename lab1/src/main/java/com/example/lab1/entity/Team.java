package com.example.lab1.entity;

public class Team {
	public long id;
	
	public String name;
	
	public String location;
	
	public String mascot;
	
	public Team() {
	}

	public Team(long id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getMascot() {
		return mascot;
	}
	
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
}
