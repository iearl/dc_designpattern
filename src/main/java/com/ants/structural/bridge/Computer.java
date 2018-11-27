package com.ants.structural.bridge;

public abstract class Computer {
    protected  Brand brand;
    public Computer(Brand brand){
        this.brand=brand;
    }
    public abstract void sell();
}

class Pad extends Computer{

    public Pad(Brand brand) {
        super(brand);
    }

    public void sell() {
        brand.showBrand();
        System.out.println("pad");
    }
}

class Desk extends Computer{

    public Desk(Brand brand) {
        super(brand);
    }

    public void sell() {
        brand.showBrand();
        System.out.println("Desk");
    }
}