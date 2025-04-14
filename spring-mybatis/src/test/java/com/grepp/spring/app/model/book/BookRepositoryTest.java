package com.grepp.spring.app.model.book;

import static org.junit.jupiter.api.Assertions.*;

import com.grepp.spring.app.model.book.code.Category;
import com.grepp.spring.app.model.book.dto.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations={
    "file:src/main/webapp/WEB-INF/spring/root-context.xml",
    "file:src/main/webapp/WEB-INF/spring/servlet-context.xml"
})
@Slf4j
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void selectAll(){
        log.info("all books : {} ", bookRepository.selectAll());
    }
    
    @Test
    public void selectById(){
        log.info("book : {} ", bookRepository.selectById(1000));
    }
    
    @Test
    public void insert(){
        Book book = new Book();
        book.setCategory(Category.HUMANITY);
        book.setTitle("진리의 정당화");
        book.setAuthor("하버마스");
        book.setInfo("어려운 책입니다.");
        bookRepository.insert(book);
    }
    
    @Test
    public void update(){
        Book book = new Book();
        book.setBkIdx(1005);
        book.setTitle("정의란 무엇인가");
        book.setAuthor("샌델");
        bookRepository.update(book);
    }
    
    
    
    
    
    
    
    
    
}