package com.ants.creational.builder;

public class Client {
    public static void main(String[] args) {
        DirectorComputerImpl director = new DirectorComputerImpl(new BuilderComputerImpl());
        Computer c = director.directorComputer();
        System.out.println(c.getMouse());
    }
}
