package com.vaneede.ronald;

import java.util.Observable;
import java.util.Observer;

public class Canvas implements Observer {
    public void update(Circle circle) {
        System.out.println("Canvas::update");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Canvas::update");
    }
}
