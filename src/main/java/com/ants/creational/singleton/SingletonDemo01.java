package com.ants.creational.singleton;

/**
 * 单例模式：饿汉式
 */
public class SingletonDemo01 {

    //类初始化立即加载，由于类加载时完成初始化，线程安全。不用同步快，调用效率高。
    private static SingletonDemo01 instance = new SingletonDemo01();

    private SingletonDemo01() {

    }

    public static SingletonDemo01 getInstance() {
        return instance;
    }
}
