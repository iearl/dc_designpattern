package com.ants.creational.singleton;

/**
 * 单例模式：懒汉式双重检查锁
 */
public class SingletonDemo04 {

    //由于编译器优化和JVM内部模型原因，同步块会有问题，会出现问题
    private static SingletonDemo04 instance = null;

    private SingletonDemo04() {

    }

    public static SingletonDemo04 getInstance() {

        if (instance == null) {
            synchronized (SingletonDemo04.class) {
                if (instance == null) {
                    instance = new SingletonDemo04();
                }
            }

        }
        return instance;
    }
}
