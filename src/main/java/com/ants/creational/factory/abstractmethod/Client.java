package com.ants.creational.factory.abstractmethod;

public class Client {
    public static void main(String[] args) {
        Factory f1 = new RedRectangleFactory();
        f1.getColor().fill();
        f1.getShape().draw();


    }
}
