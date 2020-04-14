package com.cg.jpaintro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpaintro.entities.Book;


public class BookDaoImpl implements BookDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();

	
	@Override
	public Book getBookById(int id) {
		Book book = em.find(Book.class, id);
		return book;
	}


	
	@Override
	public List<Book> getAuthorBooks(String firstName) {
		String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";
		TypedQuery<Book> query = em.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", firstName);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	
	@Override
	public List<Book> getAllBooks() {
		Query query = em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public List<Book> getBooksInPriceRange(int low,int high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book> query = em.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

}
