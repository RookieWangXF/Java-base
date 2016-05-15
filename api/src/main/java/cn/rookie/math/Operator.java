package cn.rookie.math;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.math
 * Description:
 */
public class Operator {
    private int arg;

    public Operator(int arg) {
        this.arg = arg;
    }

    public boolean One(int arg) {
        return this.arg > arg;
    }

    public int Two() {
        return this.arg >> 1;
    }
    public int Three() {
        return this.arg >>> 1;
    }

    public static void main(String[] args) {
        Operator o = new Operator(9);
        System.out.println(o.One(8));
        System.out.println(o.Two());
        System.out.println(o.Three());

        o = new Operator(-9);
        System.out.println(o.One(-8));
        System.out.println(o.Two());
        System.out.println(o.Three());
    }
}
