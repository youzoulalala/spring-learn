package com.wyd.bean;


public class FactoryBean implements org.springframework.beans.factory.FactoryBean<Emp> {
    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Emp getObject() throws Exception {
        return new Emp();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
