package com.example.BookAdvancedAPI.controller;

import com.example.BookAdvancedAPI.entity.Author;
import com.example.BookAdvancedAPI.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    // GET all authors
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    // GET author by id
    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable int id){
        return authorRepository.findById(id);
    }

    // ADD new author
    @PostMapping
    public Author addAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }

    // DELETE author
    @DeleteMapping("/{id}")
    public String deleteAuthor(@PathVariable int id){
        authorRepository.deleteById(id);
        return "Author deleted successfully";
    }
}