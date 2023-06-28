package com.utah.dto;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * @author zhuyin
 * @title UserWithInterface
 * @description TODO
 * @date 2022/8/24 16:02
 */
public class UserWithInterface implements InitializingBean {
    private static final String defaultName = "java";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
        if (name == null) {
            System.out.println("InitializingBean Using  default name");
            name = defaultName;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalAccessException("you must set the age property of  any  beans of type" + UserWithInterface.class);
        }
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct init bean:" + this.name);
    }

    @Override
    public String toString() {
        return "UserWithInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
