package com.example.Service;

import com.example.Repository.BookListRepo;
import com.example.model.BookList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.Optional;

@Service
public class BookListService {
    BookListRepo bookListRepo ;
    BookList bookList;
    public BookListService(BookListRepo bookListRepo) {
        this.bookListRepo = bookListRepo;
    }
    public BookList saveBook(BookList bookList){
        return bookListRepo.save(bookList);
    }
    public BookList findById(Long id){
       Optional<BookList> find = bookListRepo.findById(id);
       if(find.isPresent()){
           BookList bookList = find.get();
           return bookList;
       }else{
        return new BookList();
       }
    }
    public BookList updateById(Long id, BookList bookList){
       BookList existing = bookListRepo.findById(id).orElseThrow(()->
               null
               );
       existing.setBookName(bookList.getBookName());
       existing.setAuthorName(bookList.getAuthorName());
       return bookListRepo.save(existing);

    }
    public void deleteById(Long id){
        bookListRepo.deleteById(id);

    }
    public void deleteAll(){
        bookListRepo.deleteAll();
    }

}
