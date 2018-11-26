package com.ants.creational.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car1 = factory.createCar("宝马");
        Car car2 = factory.createCar("奥迪");
        car1.run();
        car2.run();
    }
}
