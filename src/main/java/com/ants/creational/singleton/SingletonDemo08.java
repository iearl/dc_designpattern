package com.ants.creational.singleton;


/**
 * 单例模式：枚举类实现懒加载
 */
public class SingletonDemo08 {

    // 私有构造函数
    private SingletonDemo08() {

    }

    public static SingletonDemo08 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonDemo08 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonDemo08();
        }

        public SingletonDemo08 getInstance() {
            return singleton;
        }
    }
}
