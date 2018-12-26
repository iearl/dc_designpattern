package com.ants.behavioral.Iterator;

/**
 * 定义迭代器接口
 */
public interface MyIterator {
    void first();//将游标指向第一个元素的下标
    void next();//将游标指向下一个元素的下标
    boolean hasNext();//是否有下一个元素
    boolean isFirst();//是否是第一个元素
    Object getCurrentObject();//获得当前元素
}
