package com.ants.creational.prototype;

import java.util.Date;

/**
 * 原型模式-克隆模式-复制模式
 * 实现Cloneable接口，重写Object类中的Close方法
 */
public class Person implements Cloneable{
    private String name;
    private int age;
    private Date birthday;
    public Person() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //深复制
        Person p = (Person)obj;
        p.birthday=(Date) this.birthday.clone();
        //end
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
