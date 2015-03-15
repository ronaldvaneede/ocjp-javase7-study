package com.vaneede.ronald;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println(circle);

        CircleTransfer circleTransfer = circle.getCircleTransferObject();

        CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMS");
        circleDAO.insertCircle(circleTransfer);

        circleDAO = DAOFactory.getCircleDAO("XML");
        circleDAO.insertCircle(circleTransfer);
    }
}
