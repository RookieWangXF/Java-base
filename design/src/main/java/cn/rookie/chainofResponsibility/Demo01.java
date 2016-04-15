package cn.rookie.chainofResponsibility;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
/*
 * 抽象处理者角色
 */
abstract class Handler{
    /*
     * 特点一：持有后继的责任对象
     */
    protected Handler successor =null;

    /*
     * 示意处理请求的方法，参数可选
     */
    public abstract void handleRequest();

    /*
     * 取值方法
     */
    public Handler getSuccessor(){
        return successor;
    }

    /*
     * 赋值方法，设置后继的责任对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user , double fee);


}

/*
 * 具体处理者角色
 */
class ConcreteHandler extends Handler{

    @Override
    public void handleRequest() {
		/*
         * 判断是否有后继的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         */
        if (getSuccessor() != null) {
            System.out.println("放过请求,由下一任的来处理");
            getSuccessor().handleRequest();
        } else {
            System.out.println("处理请求");
        }

    }

    @Override
    public String handleFeeRequest(String user, double fee) {


        return null;


    }

}

public class Demo01 {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();

        h1.setSuccessor(h2);
        h1.handleRequest();
    }

}
