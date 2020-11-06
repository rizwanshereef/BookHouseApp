package com.example.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Favourite;

@Repository
public interface FavouriteRepository extends MongoRepository<Favourite,String> {
	
	public List<Favourite> findByUsername(String name);
	public Favourite deleteByBookIdandUsername(String id, String username);
	public List<Favourite> findByBookIdAndUsername(String id, String username);
	

}
