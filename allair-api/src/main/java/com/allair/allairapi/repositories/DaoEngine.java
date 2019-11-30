package com.allair.allairapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allair.allairapi.domaine.Engine;

@Repository
public interface DaoEngine extends CrudRepository<Engine, Integer> {

}
