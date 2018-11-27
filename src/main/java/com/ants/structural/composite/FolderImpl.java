package com.ants.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderImpl implements Folder {

    private List<AbstractionComponnent> list = new ArrayList<AbstractionComponnent>();
    private String name;
    public   FolderImpl(String name){
        this.name = name;
    }
    public void killVirus() {
        System.out.println(name+"文件夹杀毒");
        for (AbstractionComponnent file : list) {
            file.killVirus();
        }
    }

    public void add(AbstractionComponnent a) {
        list.add(a);
    }

    public void remove(AbstractionComponnent file){
        list.remove(file);
    }


    public AbstractionComponnent getChild(int index){
        return list.get(index);
    }


}
