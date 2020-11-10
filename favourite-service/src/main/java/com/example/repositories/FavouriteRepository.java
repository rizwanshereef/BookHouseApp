package com.example.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Favourite;

public interface FavouriteRepository extends MongoRepository<Favourite,String> {
	
	List<Favourite> findByUserId(String userId);

	

}
