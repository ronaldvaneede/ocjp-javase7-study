package com.vaneede.ronald;

public class DisplayFriendlyCircle implements DisplayFriendlyShape {
    private int xPos;
    private int yPos;
    private int radius;

    public DisplayFriendlyCircle(int x, int y, int r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
        System.out.println("DisplayFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyCircle draw()");
    }
}
