package com.ants.creational.builder;

public class DirectorComputerImpl implements IDirectorComputer {

    private IBuilderComputer builder = null;

    public DirectorComputerImpl(IBuilderComputer builder) {
        this.builder = builder;
    }

    public Computer directorComputer() {
        Computer computer = new Computer();
        computer.setDisplay(builder.builderDisplay());
        computer.setKeyboard(builder.builderKeyboard());
        computer.setMouse(builder.builderMouse());
        return computer;
    }
}
