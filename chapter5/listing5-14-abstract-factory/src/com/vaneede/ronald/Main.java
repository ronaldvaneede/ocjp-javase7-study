package com.vaneede.ronald;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addShape("Circle", "DisplayFriendly");
        canvas.addShape("Rectangle", "DisplayFriendly");
        canvas.redraw();
    }
}
