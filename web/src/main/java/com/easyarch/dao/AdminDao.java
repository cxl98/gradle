package com.easyarch.dao;

import com.easyarch.entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin findAdminByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    @Insert("insert into admin(username,password) values(#{username},#{password})")
    int insertAdmin(Admin admin);
}
