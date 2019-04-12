package com.ryi.Factory;

/**
 * @Author: Runyi
 * @Date: 4/10/0010  17:23
 */
public class FactoryDemo {
    public static void main(String[] args){
        ShapeFactory sf1 = new ShapeFactory();
        Shape sp1 = sf1.getShape("1");
        sp1.draw();
    }
}
