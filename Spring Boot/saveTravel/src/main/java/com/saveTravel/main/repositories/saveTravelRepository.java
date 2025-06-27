package com.saveTravel.main.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saveTravel.main.models.saveTravel;

@Repository
public interface saveTravelRepository extends CrudRepository<saveTravel, Long> {
    List<saveTravel> findAll(); 
}
