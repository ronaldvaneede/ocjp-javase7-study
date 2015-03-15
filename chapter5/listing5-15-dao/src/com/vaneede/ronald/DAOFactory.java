package com.vaneede.ronald;

public class DAOFactory {
    public static CircleDAO getCircleDAO(String sourceType) {
        switch (sourceType) {
            case "RDBMS":
                return new RDBMSDAO();
            case "XML":
                return new XMLDAO();
        }
        return null;
    }
}
