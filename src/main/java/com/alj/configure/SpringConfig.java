package com.alj.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.alj")
@EnableAspectJAutoProxy  //告诉spring我的aop是应用注解开发的
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig{
}
