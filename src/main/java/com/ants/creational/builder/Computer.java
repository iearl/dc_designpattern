package com.ants.creational.builder;

/**
 * 创建对象，组合各部分组建
 */
public class Computer {
    private Keyboard keyboard;
    private  Mouse mouse;
    private Display display;

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}

class Keyboard{
    private String name;

    Keyboard(String name) {
        this.name = name;
    }
}
class Mouse{
    private String name;

    Mouse(String name) {
        this.name = name;
    }
}
class Display{
    private String name;

    public Display(String name) {
        this.name = name;
    }
}