package cn.rookie.chainofResponsibility;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
class ProjectManger extends Handler{

    @Override
    public void handleRequest() {
    }

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            if ("张三".equals(user)) {
                str = "成功：项目经理同意了" + user + "的 费用，聚餐费用为:"+ fee +"元";
            }else {
                str = "失败：项目经理不同意" + user + "的 费用，聚餐费用为:"+ fee +"元";
            }
        }else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }

}

class DeptManger extends Handler{

    @Override
    public void handleRequest() {
    }

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 1000) {
            if ("张三".equals(user)) {
                str = "成功：部门经理同意了" + user + "的 费用，聚餐费用为:"+ fee +"元";
            }else {
                str = "失败：部门经理不同意" + user + "的 费用，聚餐费用为:"+ fee +"元";
            }
        }else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }

}

class GeneralManger extends Handler{

    @Override
    public void handleRequest() {
    }

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            if ("张三".equals(user)) {
                str = "成功：总经理同意了" + user + "的 费用，聚餐费用为:"+ fee +"元";
            }else {
                str = "失败：总经理不同意" + user + "的 费用，聚餐费用为:"+ fee +"元";
            }
        }else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }

}

public class Demo02 {

    public static void main(String[] args) {
        //先要组装责任链
        Handler h1 = new GeneralManger();
        Handler h2 = new DeptManger();
        Handler h3 = new ProjectManger();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String test1 = h3.handleFeeRequest("张三", 300);
        System.out.println("test1 = " + test1);
        String test2 = h3.handleFeeRequest("李四", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = h3.handleFeeRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = h3.handleFeeRequest("李四", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = h3.handleFeeRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = h3.handleFeeRequest("李四", 1500);
        System.out.println("test6 = " + test6);

    }

}