package com.alj.dao;

import com.alj.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("insert into user values (#{id},#{username},#{name},#{age},#{gender})")
    void save(User user);
}
