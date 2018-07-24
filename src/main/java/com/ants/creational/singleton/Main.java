package com.ants.creational.singleton;



/**
 * 测试类
 */
public class Main {

    public static void main(String[] arg){
        SingletonDemo01 s1  =SingletonDemo01.getInstance();
        SingletonDemo01 s2  =SingletonDemo01.getInstance();
        System.out.println(s1==s2);

        System.out.println(SingletonDemo06.INSTANCE==SingletonDemo06.INSTANCE);
    }
}
