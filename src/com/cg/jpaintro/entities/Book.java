package com.cg.jpaintro.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="Book1")
@NamedQueries(@NamedQuery(name = "getAllBooks", query = "SELECT book FROM Book book"))
public class Book implements Serializable
{
	
		
		@Id
		//@GeneratedValue(strategy=GenerationType.AUTO)
		private int bookid;
		@Override
		public String toString() {
			return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + ", author=" + author + "]";
		}
		private String title;
		private int price;
		@ManyToOne
		@JoinColumn(name="aid")
		private Author author;
		
		public Author getAuthor() {
			return author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		
		
}
