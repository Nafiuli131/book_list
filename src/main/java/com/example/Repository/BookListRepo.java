package com.example.Repository;

import com.example.model.BookList;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BookListRepo implements JpaRepository<BookList,Long> {
}
