package com.ants.creational.factory.methodMethod;

public class BWMCarFactory implements CarFactory {

    public Car createCar() {

        return new BWMCar();
    }
}
