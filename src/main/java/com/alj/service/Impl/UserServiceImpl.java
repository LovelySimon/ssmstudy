package com.alj.service.Impl;
import com.alj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void save(){
        Long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            System.out.println("userservice save");
        }
        Long end = System.currentTimeMillis();
        Long time = end-start;
        System.out.println("执行万次消耗了"+time+"ms");
    }

    @Override
    public void delete() {
        System.out.println("userservice delete");
    }

    @Override
    public void select() {
        System.out.println("userservice select");
    }
}
