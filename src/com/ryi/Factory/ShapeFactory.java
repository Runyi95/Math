package com.ryi.Factory;

/**
 * @Author: Runyi
 * @Date: 4/10/0010  17:16
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equals("")) {
            return null;
        }
        if (shapeType == "1") {
            return new Rectangle();
        }else if (shapeType == "2") {
            return new Square();
        }else if (shapeType == "3") {
            return new Circle();
        }

        return null;
    }
}
