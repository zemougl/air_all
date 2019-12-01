package com.allair.allairapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allair.allairapi.domaine.Client;
import com.allair.allairapi.domaine.Engine;
import com.allair.allairapi.domaine.Location;
import com.allair.allairapi.dtos.DtoClient;
import com.allair.allairapi.dtos.DtoLocation;
import com.allair.allairapi.dtos.DtoSav;
import com.allair.allairapi.repositories.DaoClient;
import com.allair.allairapi.repositories.DaoEngine;
import com.allair.allairapi.repositories.DaoLocation;

@Service
public class AllAirService {
	
	@Autowired
	private DaoClient daoClient;
	@Autowired
	private DaoEngine daoEngine;
	@Autowired
	private DaoLocation daoLocation;
	
	public boolean louer(DtoLocation location) {
		Location l = new Location();
		l.setIdClient(daoClient.findById(new Integer(1)).get().getId());
		l.setIdEngine(location.getIdEngine());
		l.setDateDebut(location.getDateDebut());
		l.setDateFin(location.getDateFin());
		daoLocation.save(l);
		Engine e = daoEngine.findById(location.getIdEngine()).get();
		e.setFlgLck(true);
		daoEngine.save(e);
		return true;
	}
	
	public void signaler(DtoSav sav) {
		Optional<Engine> e = daoEngine.findClientByflgLck(true);
		if (e.isPresent()) {
			Engine entity = e.get();
			entity.setProbleme(sav.getMessageUsr());
			daoEngine.save(entity);
		}
	}
	
	public boolean sIdentifier(String login, String pass) {
		Client c = daoClient.findClientByLoginAndPass(login, pass);
		return c==null ? false : true;
	}
	
	public void sInscrire(DtoClient client) {
		Client c = new Client();
		daoClient.save(c);
	}
	
	public List<DtoLocation> historique() {
		List<DtoLocation> dtos = new ArrayList<>();
		for (Location l : daoLocation.findAll()) {
			DtoLocation dto = new DtoLocation();
			dto.setDateDebut(l.getDateDebut());
			dto.setDateFin(l.getDateFin());
			dto.setIdEngine(l.getIdEngine());
			dto.setIdClient(l.getIdClient());
			dtos.add(dto);
		}
		return dtos;
	}
	
	public List<DtoSav> sav() {
		List<DtoSav> dtos = new ArrayList<>();
		for (Engine e : daoEngine.findAll()) {
			DtoSav dto = new DtoSav();
			dto.setIdEngine(e.getId());
			dto.setMessageUsr(e.getProbleme());
			dtos.add(dto);
		}
		return dtos;
	}
}
