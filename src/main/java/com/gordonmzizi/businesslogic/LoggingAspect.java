package com.gordonmzizi.businesslogic;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(void MyService.*(..))")
    public void interceptBefore(){
        System.out.println("Logging before executing business logic");
    }

    @After("execution(void MyService.*(..))")
    public void interceptAfter(){
        System.out.println("Logging after executing business logic");
    }
}
