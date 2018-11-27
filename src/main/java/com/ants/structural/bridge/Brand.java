package com.ants.structural.bridge;

/**
 * 品牌
 */
public interface Brand {
    void showBrand();
}

class Dell implements  Brand{

    public void showBrand() {
        System.out.println("戴尔");
    }
}
class Apple implements  Brand{

    public void showBrand() {
        System.out.println("苹果");
    }
}