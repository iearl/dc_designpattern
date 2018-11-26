package com.ants.structural.proxy.staticProxy;

public class ProxyStar implements  Star {

    private Star stat;
    public ProxyStar(Star stat){
        this.stat = stat;
    }

    public void sing() {
        System.out.println("doSomething");
        stat.sing();
        System.out.println("doSomething");
    }
}
