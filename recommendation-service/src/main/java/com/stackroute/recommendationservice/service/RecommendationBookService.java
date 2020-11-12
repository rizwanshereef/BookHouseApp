package com.stackroute.recommendationservice.service;
import java.util.List;

import com.stackroute.recommendationservice.exception.RecommendationBookAlreadyExistsException;
import com.stackroute.recommendationservice.exception.RecommendationBookNotFoundException;
import com.stackroute.recommendationservice.model.RecommendationBook;



public interface RecommendationBookService {
	
	boolean saveRecommendationBook(RecommendationBook recommendationbook) throws RecommendationBookAlreadyExistsException;

	boolean deleteRecommendationBookById(int id) throws RecommendationBookNotFoundException;

	RecommendationBook getRecommendationBookById(int id) throws RecommendationBookNotFoundException;

	List<RecommendationBook> getMyRecommendationBooks(String userId);

}
