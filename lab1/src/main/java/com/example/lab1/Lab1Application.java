package com.example.lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lab1.dao.TeamRepository;
import com.example.lab1.entity.Player;
import com.example.lab1.entity.Team;

@SpringBootApplication
public class Lab1Application {
	@Autowired
	public TeamRepository teamRepository;
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Big Easy", "Showman"));
		players.add(new Player("Buckets", "Guard"));
		players.add(new Player("Dizzy", "Guard"));
		
		teamRepository.saveAll(Arrays.asList(new Team("Harlem", "Globetrotters", players), new Team("Washington", "Generals")));
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

}
