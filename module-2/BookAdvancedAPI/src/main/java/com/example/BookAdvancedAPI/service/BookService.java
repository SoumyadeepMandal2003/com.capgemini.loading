package com.example.BookAdvancedAPI.service;

import com.example.BookAdvancedAPI.entity.Book;
import com.example.BookAdvancedAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> findExpensiveBooks(double price){
        return bookRepository.findByPriceGreaterThan(price);
    }

    public Page<Book> getBooksPagination(int page,int size){
        Pageable pageable = PageRequest.of(page,size);
        return bookRepository.findAll(pageable);
    }

    public List<Book> sortBooks(){
        return bookRepository.findAll(Sort.by("price"));
    }
}