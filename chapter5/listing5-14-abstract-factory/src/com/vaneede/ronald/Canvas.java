package com.vaneede.ronald;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addShape(String shapeType, String factoryType) {
        ShapeFactory factory = null;
        switch (factoryType) {
            case "PrinterFriendly":
                factory = new PrinterFriendlyFactory();
                break;
            case "DisplayFriendly":
                factory = new DisplayFriendlyFactory();
                break;
        }
        Shape shape = factory.getShape(shapeType);
        shapeList.add(shape);
    }

    public void redraw() {
        Iterator<Shape> itr = shapeList.iterator();
        while(itr.hasNext()) {
            Shape shape = itr.next();
            shape.draw();
        }
    }
}
