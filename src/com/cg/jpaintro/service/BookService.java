package com.cg.jpaintro.service;

import java.util.List;

import com.cg.jpaintro.entities.Book;



public interface BookService {

	public abstract Book getBookById(int id);

	public abstract List<Book> getAuthorBooks(String firstName);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksInPriceRange(int low, int high);

}