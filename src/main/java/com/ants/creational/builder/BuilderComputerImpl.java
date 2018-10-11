package com.ants.creational.builder;

public class BuilderComputerImpl implements IBuilderComputer {
    public Keyboard builderKeyboard() {
        System.out.println("键盘");
        return new Keyboard("键盘");
    }

    public Mouse builderMouse() {
        System.out.println("鼠标");
        return new Mouse("鼠标");
    }

    public Display builderDisplay() {
        System.out.println("显示屏");
        return new Display("显示屏");
    }
}
