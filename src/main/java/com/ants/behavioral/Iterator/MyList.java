package com.ants.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类，提供数据
 * @param <T>
 */
public class MyList<T> {
    private List<T> list = new ArrayList<T>();
    public void add(T t){
        list.add(t);
    }
    public void remove(T t){
        list.remove(t);
    }
    public List<T> getList(){
        return list;
    }
    public void setList(List<T> t){
        list = t;
    }
    //获得迭代器
    public MyIterator createIterator(){
        return new Iterator();
    }
    //内部类实现迭代器，可以直接访问外部类元素
    private class Iterator implements MyIterator{
        private int cursor;//下标
        public void first() {
            cursor=0;
        }

        public void next() {
            cursor++;
        }

        public boolean hasNext() {
            return cursor<list.size();
        }

        public boolean isFirst() {
            return 0==cursor;
        }

        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
