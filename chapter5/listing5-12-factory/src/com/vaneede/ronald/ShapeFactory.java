package com.vaneede.ronald;

public class ShapeFactory {
    public static Shape getShape(String sourceType) {
        switch (sourceType) {
            case "Circle":
                return new Circle(10, 10, 20);
            case "Rectangle":
                return new Rectangle(10, 20);
        }
        return null;
    }
}
