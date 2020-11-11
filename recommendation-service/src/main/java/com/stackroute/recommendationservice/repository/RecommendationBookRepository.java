package com.stackroute.recommendationservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackroute.recommendationservice.model.RecommendationBook;



public interface RecommendationBookRepository extends JpaRepository<RecommendationBook,Integer> {
	
	List<RecommendationBook> findByUserId(String userId);
}

