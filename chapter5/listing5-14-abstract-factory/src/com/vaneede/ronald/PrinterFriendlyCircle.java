package com.vaneede.ronald;

public class PrinterFriendlyCircle implements PrinterFriendlyShape {
    private int xPos;
    private int yPos;
    private int radius;

    public PrinterFriendlyCircle(int x, int y, int r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
        System.out.println("PrinterFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyCircle draw()");
    }
}
