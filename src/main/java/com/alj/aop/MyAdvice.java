package com.alj.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
//通知类
public class MyAdvice {
    //通知advice
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
    //定义切入点
    @Pointcut("execution(void com.alj.service.UserService.delete())")
    private void pt(){}
}

