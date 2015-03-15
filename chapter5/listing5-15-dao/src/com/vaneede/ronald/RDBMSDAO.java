package com.vaneede.ronald;

public class RDBMSDAO implements CircleDAO {
    @Override
    public void insertCircle(CircleTransfer circle) {
        System.out.println("RDBMSDAO insertCircle implementation");
    }

    @Override
    public CircleTransfer findCircle(int id) {
        System.out.println("RDBMSDAO findCircle implementation");
        return null;
    }

    @Override
    public void deleteCircle(int id) {
        System.out.println("RDBMSDAO deleteCircle implementation");
    }
}
