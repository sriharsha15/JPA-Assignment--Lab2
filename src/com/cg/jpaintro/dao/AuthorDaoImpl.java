package com.cg.jpaintro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.cg.jpaintro.entities.Author;

public class AuthorDaoImpl implements AuthorDao{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
@Override
public Author getAuthorById(int authorid) {

	Author author = em.find(Author.class, authorid);
	return author;
}

@Override
public void addAuthor(Author author) {

	em.persist(author);
}

@Override
public void removeAuthor(Author author) {
	// TODO Auto-generated method stub
	em.remove(author);
}

@Override
public void updateAuthor(Author author) {
	// TODO Auto-generated method stub
	em.merge(author);
	
}

@Override
public void commitTransaction() {
	// TODO Auto-generated method stub
	
	em.getTransaction().commit();
}

@Override
public void beginTransaction() {
	// TODO Auto-generated method stub
	em.getTransaction().begin();
}

}
