package com.ants.creational.prototype;

import java.util.Date;

/**
 * 浅复制
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1234567L);
        Person2 p = new Person2();
        p.setName("测试");
        p.setAge(10);
        p.setBirthday(date);

        System.out.println("原型修改前时间"+p.getBirthday());

        p.setBirthday(new Date(9876543));
        Person2 p2 = (Person2) p.clone();
        System.out.println("原型修改后时间"+p.getBirthday());

        System.out.println("克隆类继承时间"+p2.getBirthday());
    }
}
