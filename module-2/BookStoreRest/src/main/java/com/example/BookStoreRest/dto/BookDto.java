package com.example.BookStoreRest.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookDto {

    @NotBlank(message = "Book should have a title")
    private String title;

    @NotBlank(message = "Book should have an author")
    private String author;

    @DecimalMin(value = "100.0", message = "Minimum price should be 100")
    private double price;
}