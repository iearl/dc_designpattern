package com.ants.creational.singleton;

/**
 * 单例模式：枚举类
 */
public enum SingletonDemo06 {
    //直接用SingletonDemo06.INSTANCE本身代理，代表一个对象
    //避免反射、反序列化，效率高
    //没有懒加载
   INSTANCE;
   Enum ss;
}
