package com.easyarch.dao;

import com.easyarch.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    @Select("Select * from user where username=#{username} and password=#{password}")
    User findByNameAndPassword(@Param("username") String username, @Param("password") String password);

    @Insert("insert into user(username,password,age,phone,major,zClass,gender) values(#{username},#{password},#{age},#{phone},#{major},#{zClass},#{gender})")
    void insertUser(User user);
}
