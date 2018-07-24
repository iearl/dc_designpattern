package com.ants.creational.singleton;

/**
 * 单例模式：懒汉式线程安全
 */
public class SingletonDemo03 {

    //类初始化延迟加载，方法同步线程安全，调用效率低。
    private static SingletonDemo03 instance = null;

    private SingletonDemo03() {
    }

    public static synchronized SingletonDemo03 getInstance() {

        if (instance == null) {
            instance = new SingletonDemo03();
        }
        return instance;
    }
}
