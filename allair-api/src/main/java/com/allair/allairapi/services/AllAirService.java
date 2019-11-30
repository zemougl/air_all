package com.allair.allairapi.services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allair.allairapi.domaine.Client;
import com.allair.allairapi.domaine.Engine;
import com.allair.allairapi.domaine.Location;
import com.allair.allairapi.dtos.DtoClient;
import com.allair.allairapi.repositories.DaoClient;
import com.allair.allairapi.repositories.DaoEngine;
import com.allair.allairapi.repositories.DaoLocation;
import com.allair.allairapi.utils.AllAirUtils;

@Service
public class AllAirService {
	
	@Autowired
	private DaoClient daoClient;
	@Autowired
	private DaoEngine daoEngine;
	@Autowired
	private DaoLocation daoLocation;
	
	public void louer(Integer idClient) {
		Location l = new Location();
		l.setIdClient(idClient);
		Engine e = daoEngine.findClientByflgLck(false);
		l.setIdEngine(e.getId());
		l.setDateDebut(LocalDateTime.now());
		l.setDateFin(LocalDateTime.now());
		daoLocation.save(l);
		e.setFlgLck(true);
		daoEngine.save(e);
	}
	
	public void signaler(Integer idEngine) {
		Optional<Engine> e = daoEngine.findById(idEngine);
		if (e.isPresent()) {
			Engine entity = e.get();
			entity.setProbleme("un probleme est survenue");
			daoEngine.save(entity);
		}
	}
	
	public boolean sIdentifier(String login, String pass) {
		Client c = daoClient.findClientByLoginAndPass(login, AllAirUtils.encode64(pass));
		return c==null ? false : true;
	}
	
	public void sInscrire(DtoClient client) {
		Client c = new Client();
		daoClient.save(c);
	}
}
