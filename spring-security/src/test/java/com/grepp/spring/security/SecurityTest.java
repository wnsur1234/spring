package com.grepp.spring.security;

import com.grepp.spring.app.model.member.dto.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/spring/root-context.xml",
    "file:src/main/webapp/WEB-INF/spring/servlet-context.xml"
})
public class SecurityTest {
    @Autowired
    private SecurityTestService securityTestService;
    
    @Test
    @WithMockUser(username = "test")
    public void preAuthorized(){
        Member member = new Member();
        member.setUserId("test");
        securityTestService.testPreAuthorize(member);
    }




}
