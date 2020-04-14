package com.cg.jpaintro.dao;

import java.util.List;

import com.cg.jpaintro.entities.Book;

public interface BookDao {

	public abstract Book getBookById(int id);
	
	public abstract List<Book> getAuthorBooks(String author);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksInPriceRange(int low, int high);

}