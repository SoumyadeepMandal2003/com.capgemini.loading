package com.example.LMS.controller;

import com.example.LMS.model.Book;
import com.example.LMS.service.BookService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/add")
    public String addBook(@Valid @ModelAttribute("book") Book book,
                          BindingResult result) {
        if (result.hasErrors()) {
            return "add-book";
        }
        bookService.addBook(book);
        return "redirect:/books/list"; // PRG
    }

    @GetMapping("/list")
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "view-books";
    }

    @GetMapping("/{id}")
    public String viewBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "book-details";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/books/list";
    }
}