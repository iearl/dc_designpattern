package com.ants.creational.singleton;


import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 测试类
 */
public class Main2 {

    public static void main(String[] arg) throws Exception{
        SingletonDemo07 s1  =SingletonDemo07.getInstance();
        SingletonDemo07 s2  =SingletonDemo07.getInstance();
        System.out.println(s1==s2);

        //通过在构造方法中判断instance是否为空解决反射问题，反射可调用私有构造器
       /* Class<SingletonDemo07> clazz =(Class<SingletonDemo07>)Class.forName("com.ants.creational.singleton.SingletonDemo07");
        Constructor<SingletonDemo07> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);//跳过权限校验
        SingletonDemo07 s3 = constructor.newInstance();
        SingletonDemo07 s4 = constructor.newInstance();
        System.out.println(s3==s4);*/

       //通过反序列化得方式破解单例,在单例类加入回调函数readResolve()方法
        FileOutputStream fos = new FileOutputStream("e:/oos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        FileInputStream fis  = new FileInputStream("e:/oos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonDemo07 s3 = (SingletonDemo07)ois.readObject();
        System.out.println(s3==s1);
    }
}
