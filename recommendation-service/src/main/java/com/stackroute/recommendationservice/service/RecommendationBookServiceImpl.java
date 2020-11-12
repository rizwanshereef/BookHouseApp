package com.stackroute.recommendationservice.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.recommendationservice.exception.RecommendationBookAlreadyExistsException;
import com.stackroute.recommendationservice.exception.RecommendationBookNotFoundException;
import com.stackroute.recommendationservice.model.RecommendationBook;
import com.stackroute.recommendationservice.repository.RecommendationBookRepository;



@Service
public class RecommendationBookServiceImpl implements RecommendationBookService {
	
	@Autowired
	private RecommendationBookRepository recommendationbookrepository;

	@Override
	public boolean saveFavouriteBook(RecommendationBook recommendationbook) throws RecommendationBookAlreadyExistsException {
		Optional<RecommendationBook> obj=recommendationbookrepository.findById(recommendationbook.getId());
		if(obj.isPresent()){
		throw new RecommendationBookAlreadyExistsException("Book already exists, cannot be saved");
		}
		recommendationbookrepository.save(recommendationbook);
		return true;
	}

	@Override
	public boolean deleteRecommendationBookById(int id) throws RecommendationBookNotFoundException {
		RecommendationBook obj = recommendationbookrepository.findById(id).orElse(null);
		if (obj==null){
			throw new RecommendationBookNotFoundException("Book not found, cannot be deleted.");
		}
		recommendationbookrepository.delete(obj);
		return true;
	}

	@Override
	public RecommendationBook getRecommendationBookById(int id) throws RecommendationBookNotFoundException {
		RecommendationBook obj=recommendationbookrepository.findById(id).get();
		if(obj==null){
			throw new RecommendationBookNotFoundException("Book not found");
		}
		return obj;
	}

	@Override
	public List<RecommendationBook> getMyRecommendationBooks(String userId) {
		return recommendationbookrepository.findByUserId(userId);
	}

}