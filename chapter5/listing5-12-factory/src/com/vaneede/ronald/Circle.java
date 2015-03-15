package com.vaneede.ronald;

public class Circle implements Shape {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(int x, int y, int r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
        System.out.println("Circle constructor");
    }

    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void fillColor() {
        System.out.println("Circle fillColor()");
    }
}
