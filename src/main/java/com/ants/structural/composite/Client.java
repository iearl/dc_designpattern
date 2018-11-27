package com.ants.structural.composite;

public class Client {
    public static void main(String[] args) {
        FolderImpl f1;
        FolderImpl f2;
        FolderImpl f3;
        FileImpl f4;
        FileImpl f5;
        FileImpl f6;
        FileImpl f7;

        f1 = new FolderImpl("文件夹1");
        f2 = new FolderImpl("电影");
        f4 = new FileImpl("文件1");
        f5 = new FileImpl("电影1");
        f1.add(f4);
        f2.add(f5);
        f1.add(f2);

        f1.killVirus();
    }
}
