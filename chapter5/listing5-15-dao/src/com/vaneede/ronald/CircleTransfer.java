package com.vaneede.ronald;

import java.io.Serializable;

public class CircleTransfer implements Serializable {
    private int radius;
    private int xPos;
    private int yPos;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getRadius() {
        return radius;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
