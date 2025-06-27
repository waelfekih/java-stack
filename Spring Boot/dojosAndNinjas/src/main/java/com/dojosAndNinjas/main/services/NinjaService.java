package com.dojosAndNinjas.main.services;


import java.util.List;

import org.springframework.stereotype.Service;
import com.dojosAndNinjas.main.models.Ninja;
import com.dojosAndNinjas.main.repositories.NinjaRepository;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepo;

    public NinjaService(NinjaRepository ninjaRepo) {
        this.ninjaRepo = ninjaRepo;
    }

    public List<Ninja> findAll() {
        return ninjaRepo.findAll();
    }

    public Ninja create(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }

    public List<Ninja> findByDojoId(Long dojoId) {
        return ninjaRepo.findAll()
                        .stream()
                        .filter(n -> n.getDojo().getId().equals(dojoId))
                        .toList();
    }
}
