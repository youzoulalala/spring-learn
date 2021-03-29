package com.wyd.service;

import com.wyd.User;
import com.wyd.dao.UserDao;
import lombok.Data;

@Data
public class UserService {
    private UserDao userDao;

    public void addUser(User user){
        System.out.println("添加用户:" + user);
        userDao.add(user);
    }
}
