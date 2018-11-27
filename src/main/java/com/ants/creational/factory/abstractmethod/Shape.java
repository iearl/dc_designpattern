package com.ants.creational.factory.abstractmethod;

public interface Shape {
    void draw();
}
class Rectangle implements Shape{
    public void draw() {
        System.out.println("三角形");
    }
}
class Circle implements Shape{

    public void draw() {
        System.out.println("圆形");
    }
}
