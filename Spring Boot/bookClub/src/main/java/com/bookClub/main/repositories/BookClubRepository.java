package com.bookClub.main.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookClub.main.models.BookClub;

@Repository
public interface BookClubRepository extends CrudRepository<BookClub, Long> {

	List<BookClub> findAll();
}