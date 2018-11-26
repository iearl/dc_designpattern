package com.ants.creational.factory.simpleFactory;

public class Factory {
    public Car createCar(String car){
        if("宝马".equals(car)){
            return new BWMCar();
        }else if("奥迪".equals(car)){
            return new AudiCar();
        }else{
            return null;
        }
    }
}
