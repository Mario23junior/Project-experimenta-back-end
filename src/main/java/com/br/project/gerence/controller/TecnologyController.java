package com.br.project.gerence.controller;

import java.util.List;

import com.br.project.gerence.model.Technology;
import com.br.project.gerence.repository.RepositoryTecnology;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/technology")
public class TecnologyController {
   
	private RepositoryTecnology repository;
	
	public TecnologyController(RepositoryTecnology repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<Technology> list(){
		return repository.findAll();
	}
	
	@PostMapping
	public Technology save(@RequestBody Technology technology) {
		return repository.save(technology);
	}
}
