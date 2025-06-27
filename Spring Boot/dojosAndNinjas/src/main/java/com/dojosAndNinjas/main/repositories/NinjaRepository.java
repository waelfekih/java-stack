package com.dojosAndNinjas.main.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.dojosAndNinjas.main.models.Ninja;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {}
