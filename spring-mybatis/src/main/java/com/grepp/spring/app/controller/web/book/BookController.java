package com.grepp.spring.app.controller.web.book;

import com.grepp.spring.app.controller.web.book.form.BookRegistForm;
import com.grepp.spring.app.model.book.BookService;
import com.grepp.spring.app.model.book.code.Category;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {
    
    private final BookService bookService;
    
    @GetMapping("regist")
    public String regist(BookRegistForm form, Model model){
        model.addAttribute("category", Category.values());
        return "book/book-regist";
    }
    
    @PostMapping("regist")
    public String regist(@Valid BookRegistForm form, BindingResult bindingResult){
        
        if(bindingResult.hasErrors()){
            return "book/book-regist";
        }
        
        bookService.registBook(form.getThumbnail(), form.toDto());
        return "redirect:/";
    }

}
