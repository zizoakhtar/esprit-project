package com.bezkoder.springjwt.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Stage;
import com.bezkoder.springjwt.repository.StageRepository;
import com.bezkoder.springjwt.security.services.StageService;


@CrossOrigin(origins = "http://localhost:4201")
@RestController
public class StageController {
	
	@Autowired
	StageRepository sr;
	@Autowired
	StageService as;

	@GetMapping(value = "/listStage" )
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public List<Stage> propoList(){
		return  sr.findAll();

	}
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")

	@PostMapping("/addConv")
	public void AddAutorisation(@RequestBody Stage conv) {
		as.addStage(conv);

	}
}