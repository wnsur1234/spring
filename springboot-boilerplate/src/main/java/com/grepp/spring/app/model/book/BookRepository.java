package com.grepp.spring.app.model.book;

import com.grepp.spring.app.model.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
