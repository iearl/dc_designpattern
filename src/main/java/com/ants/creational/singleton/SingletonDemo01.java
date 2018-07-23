package com.ants.creational.singleton;

/**
 * 单例模式：饿汉式
 */
public class SingletonDemo01 {
    private static final SingletonDemo01 instance = new SingletonDemo01();

    private SingletonDemo01() {

    }

    public static SingletonDemo01 getInstance() {
        return instance;
    }
}
