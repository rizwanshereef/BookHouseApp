package com.stackroute.favouriteservice.repository;


import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackroute.favouriteservice.model.FavouriteBook;

public interface FavouriteBookRepository extends JpaRepository<FavouriteBook,Integer> {
	
	List<FavouriteBook> findByUserId(String userId);
}
