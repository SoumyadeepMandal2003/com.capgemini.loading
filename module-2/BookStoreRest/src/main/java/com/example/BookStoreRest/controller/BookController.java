package com.example.BookStoreRest.controller;

import com.example.BookStoreRest.dto.BookDto;
import com.example.BookStoreRest.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Book APIs", description = "CRUD operations for Books")
@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    // Create Book
    @PostMapping
    @Operation(summary = "1️⃣ Create Book")
    public ResponseEntity<BookDto> createBook(@Valid @RequestBody BookDto bookDto) {
        return ResponseEntity.status(201).body(bookService.createBook(bookDto));
    }

    // GET/Fetch ALL Book Details
    @GetMapping
    @Operation(summary = "2️⃣ Get All Books")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    // GET/Fetch book details BY ID
    @GetMapping("/{id}")
    @Operation(summary = "3️⃣ Get Book By ID")
    public ResponseEntity<BookDto> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    // PUT/Update Book Details
    @PutMapping("/{id}")
    @Operation(summary = "4️⃣ Update Book")
    public ResponseEntity<BookDto> updateBook(
            @PathVariable Long id,
            @Valid @RequestBody BookDto bookDto) {
        return ResponseEntity.ok(bookService.updateBookById(id, bookDto));
    }

    // DELETE
    @DeleteMapping("/{id}")
    @Operation(summary = "5️⃣ Delete Book")
    public ResponseEntity<BookDto> deleteBook(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.deletebyId(id));
    }
}