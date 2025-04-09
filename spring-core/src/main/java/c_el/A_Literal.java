package c_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A_Literal {
        
    // SpringEL 표현식 기반의 값을 주입해주는 어노테이션
    @Value("#{'Hello Spring EL'}")
    private String message;
    
    @Override
    public String toString() {
        return "A_Literal{" +
                   "message='" + message + '\'' +
                   '}';
    }
}
