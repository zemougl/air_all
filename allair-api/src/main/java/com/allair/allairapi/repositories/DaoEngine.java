package com.allair.allairapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allair.allairapi.domaine.Engine;

@Repository
public interface DaoEngine extends CrudRepository<Engine, Integer> {

	@Query("select e from Engine e where e.flgLck = ?1 and e.type = ?2")
	Engine findClientByflgLckAndType(boolean flgLck, String type);
	
	@Query("select e from Engine e where e.flgLck = ?1")
	Optional<Engine> findClientByflgLck(boolean flgLck);
}
