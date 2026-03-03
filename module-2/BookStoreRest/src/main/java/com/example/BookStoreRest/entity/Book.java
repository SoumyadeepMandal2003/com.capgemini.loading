package com.example.BookStoreRest.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "books")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private  double price;


}