package com.wyd.dao;

import com.wyd.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class UserDao {
    public void add(User user) {
        System.out.println("userDao, 添加用户:" + user);
    }
}
