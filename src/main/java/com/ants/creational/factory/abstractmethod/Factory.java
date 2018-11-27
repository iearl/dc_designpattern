package com.ants.creational.factory.abstractmethod;

public interface Factory {
    Color getColor();

    Shape getShape();
}

class RedRectangleFactory implements Factory {

    public Color getColor() {
        return new Red();
    }

    public Shape getShape() {
        return new Rectangle();
    }
}

class GreenCircleFactory implements Factory {

    public Color getColor() {
        return new Green();
    }

    public Shape getShape() {
        return new Circle();
    }
}