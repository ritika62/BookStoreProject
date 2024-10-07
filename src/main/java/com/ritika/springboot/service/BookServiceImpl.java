package com.ritika.springboot.service;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import com.ritika.springboot.dao.BookDAO; 
import com.ritika.springboot.entity.Book;

	@Service 
	public class BookServiceImpl  implements BookService{ 
	 
	@Autowired 
	BookDAO bookDao; 
	 
	@Override 
	public List<Book> getAllBooks() { 
	System.out.println("-----BookServiceImpl--getAllBooks()---------"); 
	return bookDao.findAll(); 
	} 
	 
	@Override 
	public Book getBookById(Integer bid) { 
	System.out.println("-----BookServiceImpl--getBookById()---------"); 
	return bookDao.findById(bid).get(); 
	} 
	 
	@Override 
	public void addBook(Book book) { 
	System.out.println("-----BookServiceImpl--addBook()---------"); 
	bookDao.save(book); 
	} 
	 
	@Override 
	public void updateBook(Book book) { 
	System.out.println("-----BookServiceImpl--updateBook()---------"); 
	bookDao.saveAndFlush(book); 
	} 
	 
	@Override 
	public void deleteBook(Integer bid) { 
	System.out.println("-----BookServiceImpl--deleteBook()---------");

	bookDao.deleteById(bid); 
	} 
	 
	} 