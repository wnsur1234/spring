package com.grepp.spring.app.controller.web.urlencoded;

import com.grepp.spring.app.controller.web.urlencoded.form.UrlEncodedForm;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// NOTE 01 @Controller
// 1. 해당 클래스를 bean으로 등록
// 2. @RequestMapping : 요청 URL과 Controller method 를 매핑
// 3. @GetMapping, @PostMapping... : 지정된 Http Method 와 URL 을 Controller 의 method 와 매핑
// 4. @RequestParam : format 이 x-www-form-urlEncoded 인 요청파라미터를
//                    Controller 의 매개변수에 매핑
// 5. @ModelAttribute : 요청파라미터를 메서드의 매개변수에 선언한 Form 객체에 매핑
//                    Model객체의 attribute에 Form 객체를 자동으로 추가
@Controller
@RequestMapping("form")
@Slf4j
public class UrlEncodedController {
    
    // SLF4J : Simple Logging Facade for Java
    // logging : TRACE > DEBUG > INFO > WARN > ERROR > FATAL
    
    // NOTE 2 : Controller 메서드 반환타입
    // 1. String : view 경로
    // 2. void   : 요청 url 을 view 경로로 지정
    // 3. ModelAndView :
    //        model : Controller 에서 view 로 전달할 데이터를 저장하는 객체
    //        view  : view 의 경로
    @GetMapping
    public String form(){
        log.debug("form  메서드");
        // forward
        return "spring/form";
    }
    
    @PostMapping
    public String form(
        UrlEncodedForm form,
        // 암묵적인 @ModelAttribute
        Model model){
        log.info("model : {}", model);
        log.info("form : {}" , form);
        model.addAttribute("payload", form);
        return "spring/result";
    }
    
    
    
    




}
