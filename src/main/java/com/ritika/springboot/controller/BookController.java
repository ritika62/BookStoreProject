package com.ritika.springboot.controller;
import java.util.List; 
import javax.servlet.http.HttpServletRequest; 
import javax.validation.Valid;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.ritika.springboot.entity.Book;
import com.ritika.springboot.service.BookService; 

@RestController
public class BookController {
@Autowired 
BookService bookService;


@GetMapping("/getAllBooks")
@ApiOperation(value = "getAllBooks",response = List.class,notes = "Gives AllBooks Object")
public List<Book> showBooksList() {
System.out.println("-------BookController--showBooksList()---------");
return bookService.getAllBooks();
}


@PutMapping("/UpdateBook")
@ApiOperation(value = "UpdateBook",response = void.class,notes = "Update the Books")
public void saveUpdateBook(Book book) {
System.out.println("-------BookController--saveUpdateBook()---------");
bookService.updateBook(book); 
}

    @PostMapping ("/AddBook")
    @ApiOperation(value = "AddBook",response = void.class,notes = "Add the Books")
    public void addBook(Book book) {
        System.out.println("-------BookController--AddBook()---------");
        bookService.addBook(book);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    @ApiOperation(value = "deleteBook",response = void.class,notes = "Delete the Books By bookId")
public void deleteBook(@PathVariable Integer bookId) {
    System.out.println("-------BookController--deleteBook()---------");
    bookService.deleteBook(bookId);

}


    @GetMapping("/getBookById/{bookId}")
    @ApiOperation(value = "getBookById",response = Book.class,notes = "Gets the Books By bookId")
    public Book viewBook (@PathVariable Integer bookId){
        System.out.println("-------BookController--viewBook()---------");
        return bookService.getBookById(bookId);

    }
}
