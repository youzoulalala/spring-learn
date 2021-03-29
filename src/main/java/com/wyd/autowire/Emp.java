package com.wyd.autowire;

import lombok.Data;

@Data
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;
}
