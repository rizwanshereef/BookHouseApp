package com.stackroute.recommendationservice.controller;

import java.util.*;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.stackroute.recommendationservice.exception.RecommendationBookAlreadyExistsException;
import com.stackroute.recommendationservice.exception.RecommendationBookNotFoundException;
import com.stackroute.recommendationservice.model.RecommendationBook;
import com.stackroute.recommendationservice.service.RecommendationBookService;

import io.jsonwebtoken.Jwts;

@CrossOrigin
@RestController
@RequestMapping("/api/recommendationbookservice")
public class RecommendationBookController {
	
	@Autowired
	private RecommendationBookService recommendationbookservice;
	
	//< - - Save Method - - >
	@PostMapping("/book")
	public ResponseEntity<?> saveNewMovie(@RequestBody RecommendationBook recommendationbook,
			HttpServletRequest request,HttpServletRequest response){
		System.out.println("Saving book");
		String authHeader=request.getHeader("authorization");
		String token=authHeader.substring(7);
		String userId=Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody().getSubject();
		System.out.println("userId: "+userId);		
		try{
			recommendationbook.setUserId(userId);
			recommendationbookservice.saveFavouriteBook(recommendationbook);
		}
		catch(RecommendationBookAlreadyExistsException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
		}
		catch(Exception e){
			return new ResponseEntity<String>("{\"message\": \""+e.getMessage()+"\"}",HttpStatus.INTERNAL_SERVER_ERROR);
			}
		return new ResponseEntity<RecommendationBook>(recommendationbook,HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/book/{id}")
	public ResponseEntity<?> deleteMovie(@PathVariable("id") int id){
		try{
			recommendationbookservice.deleteRecommendationBookById(id);
		}
		catch(RecommendationBookNotFoundException e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		catch(Exception e){
			return new ResponseEntity<String>("{\"message\": \""+e.getMessage()+"\"}",HttpStatus.INTERNAL_SERVER_ERROR);
			}
		return new ResponseEntity<String>("Book deleted successfully",HttpStatus.OK);
	}
	
	
	@GetMapping("/book/{id}")
	public ResponseEntity<?> getBook(@PathVariable("id") int id){
		RecommendationBook getrecommendationbook;
		try{
			getrecommendationbook=recommendationbookservice.getRecommendationBookById(id);
		}
		catch(RecommendationBookNotFoundException e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		catch(Exception e){
			return new ResponseEntity<String>("{\"message\": \""+e.getMessage()+"\"}",HttpStatus.INTERNAL_SERVER_ERROR);
			}
		return new ResponseEntity<RecommendationBook>(getrecommendationbook, HttpStatus.OK);
	}
	
	
	@GetMapping("/books")
	public @ResponseBody ResponseEntity<List<RecommendationBook>> getMyBooks(ServletRequest req, ServletResponse res){
		HttpServletRequest request=(HttpServletRequest) req;
		String authHeader=request.getHeader("authorization");
		String token=authHeader.substring(7);
		String userId=Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody().getSubject();
		return new ResponseEntity<List<RecommendationBook>>(recommendationbookservice.getMyRecommendationBooks(userId),HttpStatus.OK);
	}
	
	@GetMapping("/allbooks")
	public @ResponseBody ResponseEntity<List<RecommendationBook>> getAllBooks(ServletRequest req, ServletResponse res){
		HttpServletRequest request=(HttpServletRequest) req;
		String authHeader=request.getHeader("authorization");
		String token=authHeader.substring(7);
		String userId=Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody().getSubject();
		return new ResponseEntity<List<RecommendationBook>>(recommendationbookservice.getAllRecommendationBooks(),HttpStatus.OK);
	}
	
	
}
