package com.ants.creational.factory.abstractmethod;

public interface Color {
    void fill();
}
class Red implements Color{

    public void fill() {
        System.out.println("红色");
    }
}
class Green implements Color{

    public void fill() {
        System.out.println("绿色");
    }
}
