package com.grepp.spring.infra.error;

import com.grepp.spring.infra.error.exceptions.WebException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WebExceptionAdvice {

    @ExceptionHandler(WebException.class)
    public String webExceptionHandler(WebException ex, Model model){
        model.addAttribute("message", ex.code().message());
        return "error/redirect";
    }
}
