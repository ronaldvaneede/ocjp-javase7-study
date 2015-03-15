package com.vaneede.ronald;

import java.util.Observable;
import java.util.Observer;

public class ShapeArchiver implements Observer {
    public void update(Circle circle) {
        System.out.println("ShapeArchiver::update");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ShapeArchiver::update");
    }
}
