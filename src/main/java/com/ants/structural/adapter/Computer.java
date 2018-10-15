package com.ants.structural.adapter;

/**
 *   适配起可以有两种方式来完成：InputStreamReader
 *   1。通过继承，对象继承，复用代码
 *   2。通过构造函数的方式，对象组合，在这可以用接口的方式
 */
public class Computer {
    public void testWrite(IAdapter adapter){
        adapter.write();
    }
    public static void main(String[] args) {
        Computer c = new Computer();
        //IAdapter adapter = new AdapterImpl();//继承
        IAdapter adapter1 = new AdapterImpl2(new KeyBoard());//组合
        c.testWrite(adapter1);
    }
}
