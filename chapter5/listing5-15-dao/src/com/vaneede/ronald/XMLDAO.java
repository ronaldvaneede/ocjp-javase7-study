package com.vaneede.ronald;

public class XMLDAO implements CircleDAO {
    @Override
    public void insertCircle(CircleTransfer circle) {
        System.out.println("XMLDAO insertCircle implementation");
    }

    @Override
    public CircleTransfer findCircle(int id) {
        System.out.println("XMLDAO findCircle implementation");
        return null;
    }

    @Override
    public void deleteCircle(int id) {
        System.out.println("XMLDAO deleteCircle implementation");
    }
}
