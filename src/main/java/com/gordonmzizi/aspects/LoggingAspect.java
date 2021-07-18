package com.gordonmzizi.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("dummy()")
    public void interceptBefore(JoinPoint joinPoint){
        System.out.println("Logging before executing business logic "+joinPoint.getSignature());
    }

    @After("dummy()")
    public void interceptAfter(JoinPoint joinPoint){
        System.out.println("Logging after executing business logic "+joinPoint.getSignature());
    }
    @Before("args(name)")
    public void setAccountNumOne(String name){
        System.out.println("Account modifying call "+name);
    }
    @After("args(name)")
    public void setAccountNumTwo(String name){
        System.out.println("Account modified by "+name );
    }
    @Pointcut("execution(public void com.gordonmzizi.*.*.*(..))")
    public void dummy(){}
}
