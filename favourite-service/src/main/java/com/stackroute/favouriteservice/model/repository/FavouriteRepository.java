package com.stackroute.favouriteservice.model.repository;


import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackroute.favouriteservice.model.Favourite;

public interface FavouriteRepository extends JpaRepository<Favourite,Integer> {
	
	List<Favourite> findByUserId(String userId);
}
