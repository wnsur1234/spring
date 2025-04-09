package c_el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "/el/application-context.xml"
        );
        
        A_Literal aLiteral = context.getBean("a_Literal", A_Literal.class);
        System.out.println(aLiteral);
        System.out.println("==================================");
        B_Operator operator = context.getBean("b_Operator", B_Operator.class);
        System.out.println(operator);
    }
}
