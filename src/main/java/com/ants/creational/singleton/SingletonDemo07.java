package com.ants.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例模式：解决反射漏铜，通过设置constructor.setAccessible(true);//跳过权限校验，是的创建实例不一致
 *           解决序列化漏铜，readResolve()
 */
public class SingletonDemo07 implements Serializable {

    //类初始化延迟加载，方法同步线程安全，调用效率低。
    private static SingletonDemo07 instance = null;

    private SingletonDemo07() {
        if (instance != null) {//防止通过反射破解单例
            throw new RuntimeException();
        }
    }

    public static synchronized SingletonDemo07 getInstance() {

        if (instance == null) {
            instance = new SingletonDemo07();
        }
        return instance;
    }

    //反序列化时，直接返回此对象，而不生成新对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
