package com.saveTravel.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saveTravel.main.models.saveTravel;
import com.saveTravel.main.repositories.saveTravelRepository;

@Service
public class saveTravelService {

    private final saveTravelRepository saveTravelRepository;

    public saveTravelService(saveTravelRepository saveTravelRepository) {
        this.saveTravelRepository = saveTravelRepository;
    }

    public List<saveTravel> allTravels() {
        return saveTravelRepository.findAll();
    }

    public saveTravel createTravel(saveTravel saveTravel) {
        return saveTravelRepository.save(saveTravel);
    }

    public saveTravel findTravel(Long id) {
        Optional<saveTravel> optionalTravel = saveTravelRepository.findById(id);
        return optionalTravel.orElse(null);
    }

    public saveTravel updateTravel(saveTravel saveTravel) {
        return saveTravelRepository.save(saveTravel);
    }

    public void deleteTravel(Long id) {
        if (saveTravelRepository.existsById(id)) {
            saveTravelRepository.deleteById(id);
        }
    }
}
