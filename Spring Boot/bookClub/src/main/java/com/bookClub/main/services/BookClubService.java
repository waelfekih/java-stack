package com.bookClub.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookClub.main.models.BookClub;
import com.bookClub.main.repositories.BookClubRepository;

@Service
public class BookClubService {

	@Autowired
	private BookClubRepository repo;
	
	public BookClub findById(Long id) {
		
		Optional<BookClub> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	

	public List<BookClub> all() {
		return repo.findAll();
	}
	
	public BookClub create(BookClub bookClub) {
		return repo.save(bookClub);
	}
}