package com.stackroute.favouriteservice.service;

import java.util.List;

import com.stackroute.favouriteservice.exception.FavouriteBookAlreadyExistsException;
import com.stackroute.favouriteservice.exception.FavouriteBookNotFoundException;
import com.stackroute.favouriteservice.model.FavouriteBook;

public interface FavouriteBookService {

	boolean saveFavouriteBook(FavouriteBook favouritebook) throws FavouriteBookAlreadyExistsException;

	boolean deleteFavouriteBookById(int id) throws FavouriteBookNotFoundException;

	FavouriteBook getFavouriteBookById(int id) throws FavouriteBookNotFoundException;

	List<FavouriteBook> getMyFavouriteBooks(String userId);



}

