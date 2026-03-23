package com.example.BookAdvancedAPI.repository;

import com.example.BookAdvancedAPI.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
