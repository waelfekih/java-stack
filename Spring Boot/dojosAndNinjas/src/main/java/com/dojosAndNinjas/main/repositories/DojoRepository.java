package com.dojosAndNinjas.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojosAndNinjas.main.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

    @Query("SELECT d FROM Dojo d LEFT JOIN FETCH d.ninjas WHERE d.id = :id")
    Optional<Dojo> findByIdWithNinjas(Long id);
}
