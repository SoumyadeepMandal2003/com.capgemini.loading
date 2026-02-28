package com.example.LMS.service;

import com.example.LMS.exception.BookNotFoundException;
import com.example.LMS.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();
    private Long idCounter = 1L;

    public void addBook(Book book) {
        book.setId(idCounter++);
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(Long id) {
        return books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new BookNotFoundException("Book with ID " + id + " not found"));
    }

    public void deleteBook(Long id) {
        Book book = getBookById(id);
        books.remove(book);
    }
}