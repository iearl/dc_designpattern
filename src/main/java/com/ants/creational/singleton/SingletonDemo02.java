package com.ants.creational.singleton;

/**
 * 单例模式：懒汉式线程不安全
 */
public class SingletonDemo02 {

    //类初始化延迟加载，用到的时候创建，线程不安全，调用效率低。
    private static  SingletonDemo02 instance = null;

    private SingletonDemo02() {

    }

    public static SingletonDemo02 getInstance() {

        if(instance==null){
            instance = new SingletonDemo02();
        }
        return instance;
    }
}
