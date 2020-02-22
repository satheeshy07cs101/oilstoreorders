package com.repo.spring.service;

import java.util.List;

import com.repo.spring.model.Book;

public interface BookService {
	
	  
	 
	   List<Book> list1();
	   
	   long save(Book book);
	   
		Book get(long id);
	 
	 
		void update(long id, Book book);
	 
		void delete(long id);
	 
 

}
