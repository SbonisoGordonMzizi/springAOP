package com.gordonmzizi.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("dummy()")
    public void interceptBefore(){
        System.out.println("Logging before executing business logic");
    }

    @After("dummy()")
    public void interceptAfter(){
        System.out.println("Logging after executing business logic");
    }
    @Pointcut("execution(public void com.gordonmzizi.businesslogic.*.*(..))")
    public void dummy(){}
}
