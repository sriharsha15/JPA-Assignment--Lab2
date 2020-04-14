package com.cg.jpaintro.client;


import com.cg.jpaintro.entities.Author;
import com.cg.jpaintro.entities.Book;
import com.cg.jpaintro.service.AuthorService;
import com.cg.jpaintro.service.AuthorServiceImpl;
import com.cg.jpaintro.service.BookService;
import com.cg.jpaintro.service.BookServiceImpl;

public class Client {
	
	public static void main(String[] args) 
	{
		AuthorService service1=new AuthorServiceImpl();
	    Author author=new Author();
	    BookService service=new BookServiceImpl();
		author.setAuthorId(117);
		author.setFirstName("sri");
		author.setMiddleName("harsha");
		author.setLastName("Addala");
		author.setPhoneNo(1234);
		Book book1=new Book();
		book1.setBookid(115);
		book1.setTitle("how");
		book1.setPrice(700);
	    author.addBook(book1);
		service1.addAuthor(author);		
		
		System.out.println("************Listing book with id 5*************");
		System.out.println("Boo with ID 106:"+service.getBookById(5));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
//		System.out.println("************Listing book written *************");
//		for(Book book:service.getAuthorBooks("sri") ) {
//			System.out.println(book);
//		}
//		
		
		System.out.println("************Listing All books between 500 and 1000*************");
		for(Book book:service.getBooksInPriceRange(500,1000) ) {
			System.out.println(book);
		}
		
		
		//at this breakpoint, we have added one record to table
//		author = service.findAuthorById(2);
//		System.out.print("ID:"+author.getAuthorId());
//		System.out.println(" Name:"+author.getFirstName());
//		System.out.println(" Name:"+author.getMiddleName());
//		System.out.println(" Name:"+author.getLastName());
//		System.out.println(" Name:"+author.getPhoneNo());
		
//		author.setAuthorId(4);
//		author.setFirstName("murali");
//		author.setMiddleName("krishna");
//		author.setLastName("mylavarapu");
//		author.setPhoneNo(12345);
//		service.addAuthor(author);	
//		
//		author.setAuthorId(5);
//		author.setFirstName("bala");
//		author.setMiddleName("krishna");
//		author.setLastName("myla");
//		author.setPhoneNo(123457);
//		service.addAuthor(author);	
		//at this breakpoint, we have updated record added in first section
		//author = service.findAuthorById(3);
//		service.removeAuthor(author);
		System.out.println("End of program...");
		
	}
}
