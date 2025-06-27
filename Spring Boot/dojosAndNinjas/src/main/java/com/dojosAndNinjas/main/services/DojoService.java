package com.dojosAndNinjas.main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.dojosAndNinjas.main.models.Dojo;
import com.dojosAndNinjas.main.repositories.DojoRepository;

@Service
public class DojoService {
    private final DojoRepository dojoRepo;

    public DojoService(DojoRepository dojoRepo) {
        this.dojoRepo = dojoRepo;
    }

    public List<Dojo> findAll() {
        List<Dojo> dojos = new ArrayList<>();
        dojoRepo.findAll().forEach(dojos::add);
        return dojos;
    }

    public Dojo create(Dojo dojo) {
        return dojoRepo.save(dojo);
    }

    public Dojo findById(Long id) {
        return dojoRepo.findById(id).orElse(null);
    }
}
