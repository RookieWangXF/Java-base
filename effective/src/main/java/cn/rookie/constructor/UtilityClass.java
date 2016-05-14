package cn.rookie.constructor;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.constructor
 * Description:显示的构造器被私有化了，所以不可以在类的外部访问它。
 */
public class UtilityClass {

    /**
     * 为防止在类的内部实例化，抛出异常
     * 即其子类是不可以实例化的
     */
    private UtilityClass() {
        throw new AssertionError("不可以创造实例");
    }

    public static void main(String[] args) {
        UtilityClass u = new UtilityClass();
    }
}
