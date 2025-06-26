package com.burgerTrackerII.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.burgerTrackerII.main.models.Burger;
import com.burgerTrackerII.main.repositories.BurgerRepository;

@Service
public class BurgerTrackerIIService {

	private final BurgerRepository burgerRepository;

	public BurgerTrackerIIService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}

	public List<Burger> allBurgers() {
		return burgerRepository.findAll();
	}

	public Burger createBurger(Burger burger) {
		return burgerRepository.save(burger);
	}

	public Burger findBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		return optionalBurger.orElse(null);
	}

	public Burger updateBurger(Burger burger) {
		return burgerRepository.save(burger);
	}

	public void deleteBurger(Long id) {
		if (burgerRepository.existsById(id)) {
			burgerRepository.deleteById(id);
		}
	}
}