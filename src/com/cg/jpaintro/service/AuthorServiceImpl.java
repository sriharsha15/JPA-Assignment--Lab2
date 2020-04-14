package com.cg.jpaintro.service;

import com.cg.jpaintro.dao.AuthorDao;
import com.cg.jpaintro.dao.AuthorDaoImpl;
import com.cg.jpaintro.entities.Author;

public class AuthorServiceImpl implements AuthorService
{
	AuthorDao dao=new AuthorDaoImpl();

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public Author findAuthorById(int authorid) {
		// TODO Auto-generated method stub
		Author author=dao.getAuthorById(authorid);
		return author;
	}
	
	
}
