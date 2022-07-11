package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "book_list_2")
public class BookList2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long book_id;
    @Column(name = "book_name")
    private String book_name;
    @ManyToMany
    @JoinTable(name = "book_authors",joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "authors_id"))
    private List<Authors> authors = new ArrayList<>();
}
