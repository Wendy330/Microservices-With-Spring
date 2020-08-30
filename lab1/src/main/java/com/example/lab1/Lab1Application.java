package com.example.lab1;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lab1.dao.TeamRepository;
import com.example.lab1.entity.Team;

@SpringBootApplication
public class Lab1Application {
	@Autowired
	public TeamRepository teamRepository;
	
	@PostConstruct
	public void init() {
		teamRepository.saveAll(Arrays.asList(new Team("Harlem", "Globetrotters"), new Team("Washington", "Generals")));
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

}
