package com.allair.allairapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allair.allairapi.services.AllAirService;

@RestController
public class AllAirController {

	@Autowired
	private AllAirService service;
	
	@CrossOrigin
	@RequestMapping("/louer")
	public void louer() {
		 service.louer();
	}
	
	@CrossOrigin
	@RequestMapping("/warn")
	public void signaler() {
		 service.signaler();
	}
	
	@CrossOrigin
	@RequestMapping("/login")
	public void sIdentifier() {
		 service.sIdentifier();
	}
	
	@CrossOrigin
	@RequestMapping("/register")
	public void sInscrire() {
		 service.sInscrire();
	}
}
