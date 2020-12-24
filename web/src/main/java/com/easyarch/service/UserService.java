package com.easyarch.service;

import com.easyarch.dao.UserDao;
import com.easyarch.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public User login(String username,String password){
        if (null == username && null == password){
            return null;
        }
        return userDao.findByNameAndPassword(username, DigestUtils.md5DigestAsHex(password.getBytes()));
    }

    public User isFinished(String id){
        if(null!=id){
           return userDao.isFinished(id);
        }
        return  null;
    }

    public int addUser(User user){
        int i = userDao.insertUser(user);
        if (i!=0){
            return 1;
        }
        return 0;
    }
    public User findByUsername(String username){
        return userDao.findByName(username);
    }
}
