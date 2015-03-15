package com.vaneede.ronald;

public class Circle {
    private Point center;
    private ShapeArchiver shapeArchiver;
    protected Canvas canvas;
    private int radius;

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public void setCenter(Point center) {
        this.center = center;
        canvas.update(this);
        shapeArchiver.update(this);
    }

    public void setRadius(int radius) {
        this.radius = radius;
        canvas.update(this);
        shapeArchiver.update(this);
    }

    public void setShapeArchiver(ShapeArchiver shapeArchiver) {
        this.shapeArchiver = shapeArchiver;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }
}
