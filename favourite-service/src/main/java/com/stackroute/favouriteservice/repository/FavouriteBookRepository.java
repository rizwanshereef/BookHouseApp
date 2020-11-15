package com.stackroute.favouriteservice.repository;


import java.util.*;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.favouriteservice.model.FavouriteBook;

public interface FavouriteBookRepository extends MongoRepository<FavouriteBook,Integer> {
	
	List<FavouriteBook> findByUserId(String userId);

	Optional<FavouriteBook> findById(long id);
}
