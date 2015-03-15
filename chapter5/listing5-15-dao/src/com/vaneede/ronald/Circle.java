package com.vaneede.ronald;

public class Circle {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(int x, int y, int r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
    }

    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public CircleTransfer getCircleTransferObject() {
        CircleTransfer circleTransfer = new CircleTransfer();
        circleTransfer.setRadius(radius);
        circleTransfer.setxPos(xPos);
        circleTransfer.setyPos(yPos);
        return circleTransfer;
    }
}
