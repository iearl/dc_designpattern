package com.ants.creational.singleton;

/**
 * 单例模式：静态内部类懒加载
 */
public class SingletonDemo05 {

    //外部没有static属性，不会立即加载对象
    //真正调用getInstance，才会加载内部类
    //高效+安全+延迟加载
    private static class SingletonInstance {
        public static SingletonDemo05 instance = new SingletonDemo05();
    }

    private SingletonDemo05() {

    }

    public static SingletonDemo05 getInstance() {
        return SingletonInstance.instance;
    }
}
