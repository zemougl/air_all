package com.allair.allairapi.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allair.allairapi.domaine.Client;

@Repository
public interface DaoClient extends CrudRepository<Client, Integer> {
	
	@Query("select c from Client c where c.login = ?1 and c.pass = ?2")
	Client findClientByLoginAndPass(String login, String pass);
}
