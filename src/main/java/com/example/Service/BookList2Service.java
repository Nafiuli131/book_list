package com.example.Service;

import com.example.Repository.BookList2Repo;
import com.example.Repository.BookListRepo;
import com.example.model.BookList2;
import org.springframework.stereotype.Service;

@Service
public class BookList2Service {
    BookList2 bookList2;
   BookList2Repo bookList2Repo;

    public BookList2Service(BookList2Repo bookList2Repo) {
        this.bookList2Repo = bookList2Repo;
    }

    public BookList2 saveBookByAuthor(BookList2 bookList2){
        return bookList2Repo.save(bookList2);
    }
}
