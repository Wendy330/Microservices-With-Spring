package com.example.lab1.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.lab1.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
	
}
