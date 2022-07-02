package com.example.Repository;

import com.example.model.BookList;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface BookListRepo extends JpaRepository<BookList, Long> {
}
