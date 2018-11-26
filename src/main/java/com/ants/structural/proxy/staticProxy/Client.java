package com.ants.structural.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        Star proxy  = new ProxyStar(new RealStar());
        proxy.sing();
    }
}
