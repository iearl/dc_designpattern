package com.ants.behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();
        myList.add("aaa");
        myList.add("bbb");
        myList.add("ccc");
        myList.add("ddd");
        MyIterator iterator = myList.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.getCurrentObject());
            iterator.next();
        }
    }
}
