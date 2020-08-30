package com.example.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab1.dao.TeamRepository;
import com.example.lab1.entity.Team;

@RestController
public class TeamController {
	@Autowired
	public TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
	  	return teamRepository.findAll();
	}
}
