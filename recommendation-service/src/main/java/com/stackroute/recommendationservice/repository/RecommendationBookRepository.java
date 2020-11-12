package com.stackroute.recommendationservice.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.recommendationservice.model.RecommendationBook;



public interface RecommendationBookRepository extends MongoRepository<RecommendationBook,Integer> {
	
	List<RecommendationBook> findByUserId(String userId);
}

