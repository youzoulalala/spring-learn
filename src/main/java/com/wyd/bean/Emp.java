package com.wyd.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("employee")
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;
}
