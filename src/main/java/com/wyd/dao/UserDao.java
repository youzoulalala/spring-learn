package com.wyd.dao;

import com.wyd.User;
import lombok.Data;

@Data
public class UserDao {
    public void add(User user) {
        System.out.println("userDao 添加用户");
    }
}
