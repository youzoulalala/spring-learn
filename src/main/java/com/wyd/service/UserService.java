package com.wyd.service;

import com.wyd.User;
import com.wyd.dao.UserDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Data
@Service
public class UserService {

//    @Autowired
//    @Qualifier("userDao")//和 @Autowired 配合使用
//    @Autowired

//    @Resource//根据类型注入
    @Resource(name = "userDao")//根据名称注入
    private UserDao userDao;

    @Value("1")
    private Integer userAge;

    @Value("男性")
    private String userGender;

    public void addUser(User user){
        System.out.println("userAge = " + userAge);
        System.out.println("userGender = " + userGender);
        System.out.println("service, 添加用户:" + user);
        userDao.add(user);
    }
}
