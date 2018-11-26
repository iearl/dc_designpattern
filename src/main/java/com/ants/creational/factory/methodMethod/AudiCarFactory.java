package com.ants.creational.factory.methodMethod;

public class AudiCarFactory implements CarFactory {

    public Car createCar() {

        return new AudiCar();
    }
}