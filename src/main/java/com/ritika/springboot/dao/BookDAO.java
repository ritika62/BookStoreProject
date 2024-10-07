package com.ritika.springboot.dao;
import org.springframework.data.jpa.repository.JpaRepository; 
import com.ritika.springboot.entity.Book; 	
	 
	public interface BookDAO extends JpaRepository<Book, Integer>{
}
