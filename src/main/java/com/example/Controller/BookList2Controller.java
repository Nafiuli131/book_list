package com.example.Controller;

import com.example.Service.BookList2Service;
import com.example.model.BookList2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookList2Controller {
   BookList2Service bookList2Service;

    public BookList2Controller(BookList2Service bookList2Service) {
        this.bookList2Service = bookList2Service;
    }

    @PostMapping("saveBookByAuthor")
    public ResponseEntity<BookList2 > saveBookByAuthor(@RequestBody BookList2 bookList2){
        return new ResponseEntity<BookList2>(bookList2Service.saveBookByAuthor(bookList2), HttpStatus.CREATED);

    }

}
