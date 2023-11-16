package com.example.demo;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//the class containing the cross cutting concern
//logging logic
@Aspect
@Component
public class LoggingAspect {
    //this point cut expression matches to any business class where method name 
    // addAccount with no arguments
    //@Before("execution(public void com.example.demo.Account.addAccount())")
    //@After("execution(public void com.example.demo.Account.addAccount())")

    //this point cut expression matches to any business class where method name 
    //starts with add taking any no of arguments and return type of method is void
    //@Before("execution(public void add*(..))")

    //this will be applicable to any class, any method taking 0 or more than 0 arguments
    // and return type is void
    //@Before("execution(public void *(..))")

    //this will be applicable to any class, any methid taking 0 or more arguments and 
    // any return type
    @Before("execution(* *(..))")
    public void log(JoinPoint joinpoint) {
        System.out.println("logging before the method " + joinpoint.getSignature().toShortString());
        Object[] args = joinpoint.getArgs();
        for(int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        } 
    }

    @AfterReturning(pointcut="execution(* get*(..))", returning="result")
    public void log(JoinPoint joinPoint, List<String> result) {
        System.out.println("logging after returning the result " + result + 
        " " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut="execution(* get*(..))", returning="result")
    public void log(JoinPoint joinPoint, double result) {
        System.out.println("logging after returning the result " + result + 
        " " + joinPoint.getSignature().toShortString());
    }

    //this will get executed when any method in any class is throwing an exception    
    @AfterThrowing(pointcut="execution(* get*(..))", throwing="exception")
    public void log(JoinPoint joinPoint, Throwable exception) {
        System.out.println("logging after method throwing exception " + exception.getMessage() + 
        " " + joinPoint.getSignature().toShortString());
    }
    
    // proceedingJointPoint is a Subinterface of JointPoint where we can control the     
    // flow of the program, execute the target/business method
    @Around("execution(* *(..))")
    public Object logTime(ProceedingJoinPoint proceedingJoinPoint) {
        long startTime = System.currentTimeMillis();
        //this will call the target method/buiness methid where this advise is 
        //being applied
        Object obj=null;
        try {
            obj = proceedingJoinPoint.proceed();
        }
        catch(Throwable e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Duration of the method " + proceedingJoinPoint.getSignature().toShortString() + " " + (endTime - startTime));
        return obj;
    }
}
