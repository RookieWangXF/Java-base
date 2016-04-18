package cn.rookie.param;

/**
 * Created by Rookie on 2016/4/18.
 * Description:
 * Project_name: Java-base
 * Copyright (c) All Rights Reserved.
 */
public class GlobalParam {
    private String direction;

    public void setDirection(int direction) {
        switch (direction) {
            case 1:
                this.direction = "fei";
                break;
            case 2:
                this.direction = "lei";
                break;
            default:
                this.direction = "nihao";
                break;
        }
    }

    public static void main(String[] args) {
        /**
         * 全局变量的使用加上this，可以区别局部变量
         */
        GlobalParam param = new GlobalParam();
        param.setDirection(1);
        System.out.println("direction is " + param.direction);
    }
}
