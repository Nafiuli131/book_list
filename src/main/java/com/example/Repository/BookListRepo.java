package com.example.Repository;

import com.example.model.BookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public  interface BookListRepo extends JpaRepository<BookList, Long> {
    //JPQL index parameter
    @Query(value = "select bookName from BookList where id=?1")
    public String findName( Long id);
}
