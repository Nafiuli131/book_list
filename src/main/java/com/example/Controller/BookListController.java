package com.example.Controller;

import com.example.Service.BookListService;
import com.example.model.BookList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookListController {
    public BookListService bookListService;

    public BookListController(BookListService bookListService) {
        this.bookListService = bookListService;
    }

    @PostMapping("save")
    public ResponseEntity<BookList> saveBook(@RequestBody BookList bookList){
        return new ResponseEntity<BookList>(bookListService.saveBook(bookList), HttpStatus.CREATED);
    }
    @GetMapping("findById/{id}")
    public BookList findById(@PathVariable("id") long id){
        BookList bookList = bookListService.findById(id);
        return bookList;
    }
    @PutMapping("updateById/{id}")
    public ResponseEntity<BookList> updateBook(@PathVariable("id") long id,@RequestBody BookList bookList){
        return new ResponseEntity<BookList>(bookListService.updateById(id,bookList),HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteMapping(@PathVariable("id")long id){
         bookListService.deleteById(id);
         return new ResponseEntity<String>("successfully deleted",HttpStatus.OK);

    }
    @DeleteMapping("allDelete")
    public ResponseEntity<String> deleteAll(){
        bookListService.deleteAll();
        return new ResponseEntity<String >("all deleted succesfully",HttpStatus.OK);
    }
    //Query based repo
    @GetMapping("getName/{id}")
    public String getName(@PathVariable("id") long id){

      return bookListService.findName(id);

    }
}
