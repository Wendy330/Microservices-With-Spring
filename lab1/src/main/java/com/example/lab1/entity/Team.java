package com.example.lab1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	public String name;
	
	public String location;
	
	public String mascot;
	
	public Team() {
	}

	public Team(String name, String location) {
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
