package com.allair.allairapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.allair.allairapi.domaine.Location;

public interface DaoLocation extends CrudRepository<Location, Integer> {

}
