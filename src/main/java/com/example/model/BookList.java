package com.example.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "bookList")
public class BookList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorName;

}
