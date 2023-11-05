package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//the class containing the cross cutting concern
//logging logic
@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(public void com.example.demo.Account.addAcount())")
    public void log(JoinPoint joinpoint) {
        System.out.println("logging before the method " + joinpoint.getSignature().toShortString());
    }
}
