package com.ants.structural.adapter;

public class AdapterImpl2 implements IAdapter {

    private KeyBoard board;

    public AdapterImpl2(KeyBoard board) {
        this.board = board;
    }

    public void write() {
        board.writeSomething();
    }
}
