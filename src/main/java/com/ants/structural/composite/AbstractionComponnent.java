package com.ants.structural.composite;

/**
 * 抽象构件：包含容器和叶子得共同方法
 */
public interface AbstractionComponnent {
    void killVirus();
}

interface File extends AbstractionComponnent{

}
interface  Folder extends AbstractionComponnent{
    void add(AbstractionComponnent a);
    void remove(AbstractionComponnent a);
    AbstractionComponnent getChild(int index);
}
