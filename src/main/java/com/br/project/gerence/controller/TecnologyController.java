package com.br.project.gerence.controller;

import java.util.List;

import com.br.project.gerence.model.Technology;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/technology/")
public class TecnologyController {
   
	@GetMapping
	public List<Technology> list(){
		return null;
	}
}
