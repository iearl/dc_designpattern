package com.ants.creational.singleton;



/**
 * 测试类
 */
public class Main {

    public static void main(String[] arg){
        SingletonDemo01 s1  =SingletonDemo01.getInstance();
        SingletonDemo01 s2  =SingletonDemo01.getInstance();
        System.out.print(s1==s2);
    }
}
