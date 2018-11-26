package com.ants.creational.builder;

/**
 * 构建者，可以与工厂模式配合胜场对象
 */
public interface IBuilderComputer {
    Keyboard builderKeyboard();

    Mouse builderMouse();

    Display builderDisplay();
}
