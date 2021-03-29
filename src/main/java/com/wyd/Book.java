package com.wyd;

import lombok.Data;

public class Book {
/* DI:依赖注入，是IOC的一部分
*  1 set 方法注入
*  2 构造函数注入
* */

    private String bname;
    private String bauthor;
    private String address;
    private Order order;

    public Book() {
        System.out.println("第一步,创建对象");
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        System.out.println("第二步,依赖注入");
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void initMethod(){
        System.out.println("第四步,初始化方法");
    }

    public void destroyMethod(){
        System.out.println("第七步,销毁对象");
    }
}
