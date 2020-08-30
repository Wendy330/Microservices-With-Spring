package com.example.lab1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab1.entity.Team;

@RestController
public class TeamController {
	
	@GetMapping("/teams")
	public List<Team> getTeams() {
	  	return Arrays.asList(new Team(0l, "Harlem", "Globetrotters"), new Team(1l, "Washington", "Generals"));
	}
	
}
