package com.ants.creational.factory.methodMethod;


public class Client {
    public static void main(String[] args) {
        CarFactory f = new BWMCarFactory();
        f.createCar().run();
        CarFactory f2 = new AudiCarFactory();
        f2.createCar().run();
    }
}
