package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authors_id")
    public int authors_id;
    @Column(name = "auth_name")
    public String auth_name;
    @ManyToMany(mappedBy = "authors")
    private List<BookList2> bookList2s=new ArrayList<>();
}
