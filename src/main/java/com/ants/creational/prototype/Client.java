package com.ants.creational.prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1234567L);
        Person p = new Person();
        p.setName("测试");
        p.setAge(10);
        p.setBirthday(date);
        Person p2 = (Person) p.clone();

        System.out.println(p.getBirthday());

        p.setBirthday(new Date(9876543));
        System.out.println(p.getBirthday());

        System.out.println(p2.getBirthday());
    }
}
