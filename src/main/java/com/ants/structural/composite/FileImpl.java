package com.ants.structural.composite;

public class FileImpl implements File {
    private String name;
    public FileImpl(String name){
        this.name = name;
    }
    public void killVirus() {
        System.out.println(name+"文件杀毒");
    }
}
