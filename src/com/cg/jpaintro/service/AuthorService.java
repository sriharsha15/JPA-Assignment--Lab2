package com.cg.jpaintro.service;

import com.cg.jpaintro.entities.Author;

public interface AuthorService {
	public abstract void addAuthor(Author author);

	public abstract void updateAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract Author findAuthorById(int authorid);
}
