package com.stackroute.recommendationservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.recommendationservice.model.RecommendationBook;



public interface RecommendationBookRepository extends MongoRepository<RecommendationBook,Integer> {
	
	List<RecommendationBook> findByUserId(String userId);
	List<RecommendationBook> findAll();
	Optional<RecommendationBook> findById(long id);
	
}

