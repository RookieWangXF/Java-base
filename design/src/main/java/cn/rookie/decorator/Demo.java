package cn.rookie.decorator;

/**
 * Created by Rookie on 2016/4/13.
 * Description:动态的给对象添加功能
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

interface Phone{
    void functionality();
}

/**
 * 一般的手机类
 */

class CommonPhone implements Phone {

    @Override
    public void functionality() {
        System.out.println("能发短信和打电话");
    }
}

/**
 * 装饰器类
 */
class PhoneDecorator implements Phone {
    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }
    @Override
    public void functionality() {
        if (phone != null) {
            phone.functionality();
        }
    }
}

/**
 * 智能机装饰类
 */
class AdvancePhone extends PhoneDecorator {

    public AdvancePhone(Phone phone) {
        super(phone);
    }

    @Override
    public void functionality() {
        super.functionality();
        System.out.println("可以玩游戏");
    }
}

class ShanZhaiPhone extends PhoneDecorator {

    public ShanZhaiPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void functionality() {
        super.functionality();
        System.out.println("可以双卡双待");
    }
}

public class Demo {
    public static void main(String[] args) {
        Phone comPhone = new CommonPhone();
        comPhone.functionality();
        System.out.println("----------------------------------");
        AdvancePhone advancePhone = new AdvancePhone(comPhone);
        advancePhone.functionality();
        System.out.println("----------------------------------");
        ShanZhaiPhone shanZhaiPhone = new ShanZhaiPhone(comPhone);
        shanZhaiPhone.functionality();
        System.out.println("----------------------------------");
        ShanZhaiPhone shanZhaiPhone2 = new ShanZhaiPhone(new AdvancePhone(comPhone));
        shanZhaiPhone2.functionality();
    }
}
