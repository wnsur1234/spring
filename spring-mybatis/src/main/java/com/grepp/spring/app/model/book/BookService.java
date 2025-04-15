package com.grepp.spring.app.model.book;


import com.grepp.spring.app.model.book.dto.Book;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;
    
    @Transactional
    public void registBook(List<MultipartFile> thumbnail, Book dto) {
    
    }
}
