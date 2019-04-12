package com.ryi.Single;

/**
 * @Author: Runyi
 * @Date: 4/12/0012  11:19
 */
public class SingleObject {
    //创建一对一的类
    private static SingleObject instance = new SingleObject();

    static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Ryi");
    }


}
