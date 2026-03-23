package com.example.BookAdvancedAPI.repository;

import com.example.BookAdvancedAPI.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByTitle(String title);

    List<Book> findByPriceGreaterThan(double price);

    List<Book> findByTitleContaining(String keyword);

}