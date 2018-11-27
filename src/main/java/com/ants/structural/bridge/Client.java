package com.ants.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Pad(new Dell());
        computer.sell();
        System.out.println("--桥接模式,解决多重继承问题--");
        computer = new Desk(new Apple());
        computer.sell();
    }
}
