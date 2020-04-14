package com.cg.jpaintro.service;

import java.util.List;

import com.cg.jpaintro.dao.BookDao;
import com.cg.jpaintro.dao.BookDaoImpl;
import com.cg.jpaintro.entities.Book;

public class BookServiceImpl implements BookService {

	private BookDao dao;

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getAuthorBooks(String firstName) {
		return dao.getAuthorBooks(firstName);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}
	
	@Override
	public List<Book> getBooksInPriceRange(int low, int high){
		return dao.getBooksInPriceRange(low, high);
	}
}
