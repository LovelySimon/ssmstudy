package com.alj.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
//通知类
public class MyAdvice {
    //前置通知advice
//    @Before("pt()")
//    public void method(){
//        System.out.println(System.currentTimeMillis());
//    }
//    //后置通知
//    @After("pt()")
//    public void after(){
//        System.out.println(System.currentTimeMillis());
//    }
//    @Around("pt2()")
//    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before");
//        //表示对原始操作的调用
//        Object ret = pjp.proceed();
//        System.out.println("around after");
//        return ret;
//    }
    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice...");
    }
    @AfterThrowing
    public void afterThrowing(){
        System.out.println("After throwing running...");
    }

    //定义切入点
    @Pointcut("execution(void com.alj.service.UserService.delete())")
    private void pt(){}

    @Pointcut("execution(int com.alj.service.UserService.select())")
    private void pt2(){}
}

