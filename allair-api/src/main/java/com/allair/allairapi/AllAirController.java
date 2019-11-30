package com.allair.allairapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allair.allairapi.dtos.DtoClient;
import com.allair.allairapi.dtos.DtoEngine;
import com.allair.allairapi.dtos.DtoLocation;
import com.allair.allairapi.services.AllAirService;

@RestController
public class AllAirController {

	@Autowired
	private AllAirService service;
	
	@CrossOrigin
	@RequestMapping("/dispo")
	public boolean dispo() {
		return true;
	}
	
	@CrossOrigin
	@RequestMapping("/historique")
	public List<DtoLocation> historique() {
		return service.historique();
	}
	
	@CrossOrigin
	@PostMapping("/louer")
	public boolean louer(@RequestBody final DtoLocation location) {
		 return service.louer(location);
	}
	
	@CrossOrigin
	@PostMapping("/warn")
	public void signaler(@RequestBody final DtoEngine engine) {
		 service.signaler(engine.getIdEngine());
	}
	
	@CrossOrigin
	@PostMapping("/connection")
	public boolean sIdentifier(@RequestBody final DtoClient client) {
		 return service.sIdentifier(client.getLogin(), client.getPass());
	}
	
	@CrossOrigin
	@PostMapping("/register")
	public void sInscrire(@RequestBody final DtoClient client) {
		 service.sInscrire(client);
	}
}
