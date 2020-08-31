package com.example.lab1.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	public String name;
	
	public String location;
	
	public String mascot;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	public Set<Player> players;
	
	public Team() {
	}

	public Team(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public Team(String name, String location, Set<Player> players) {
		this.name = name;
		this.location = location;
		this.players = players;
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

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
}
