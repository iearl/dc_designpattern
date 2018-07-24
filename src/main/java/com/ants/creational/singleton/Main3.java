package com.ants.creational.singleton;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

/**
 * 比较不同单例单例创建效率
 * 懒汉式：在多线程情况下调用效率最低
 * 单例+不需要延迟加载-------》枚举
 * 单例+延迟加载--------------》静态内部类
 */
public class Main3 {

    public static void main(String[] arg) throws Exception{

        int threadNum = 10;
        final CountDownLatch count = new CountDownLatch(threadNum);
        long start = System.currentTimeMillis();
        for (int i=0;i<threadNum;i++){
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        SingletonDemo01.getInstance();
                    }
                    count.countDown();
                }
            }).start();
        }
        count.await();
        long end = System.currentTimeMillis();
        System.out.print("sonsume time is "+(end-start));
    }
}
