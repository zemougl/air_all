package com.allair.allairapi.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.allair.allairapi.domaine.Client;

@Repository
public interface DaoClient extends CrudRepository<Client, Integer> {

}
