package cn.rookie.enumDesign;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.enumDesign
 * Description:
 */
public enum Operation {
    PLUS("+"){
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-"){
        double apply(double x, double y){
            return x - y;
        }
    },
    TIMES("*"){
        double apply(double x, double y){
            return x * y;
        }
    },
    DIVIDE("/"){
        double apply(double x, double y){
            return x / y;
        }
    };

    private final String symbol;
    private int i;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    /**
     * 枚举中的抽象方法，必须被每一个常量具体的方法所覆盖,每一个实例都要实现所有的抽象方法才可以
     * @param x
     * @param y
     * @return
     */
    abstract double apply(double x, double y);

    public static void main(String[] args) {
        double x = 2;
        double y = 4;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f %n", x, op, y, op.apply(x, y));
        }

    }
}
