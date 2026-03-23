package com.example.BookAdvancedAPI.controller;

import com.example.BookAdvancedAPI.entity.Book;
import com.example.BookAdvancedAPI.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("/expensive/{price}")
    public List<Book> getExpensiveBooks(@PathVariable double price){
        return bookService.findExpensiveBooks(price);
    }

    @GetMapping("/page")
    public Page<Book> getBooksPagination(@RequestParam int page,
                                         @RequestParam int size){
        return bookService.getBooksPagination(page,size);
    }

    @GetMapping("/sort")
    public List<Book> sortBooks(){
        return bookService.sortBooks();
    }
}