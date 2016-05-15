package cn.rookie.enumDesign;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.enumDesign
 * Description:编写一个标准的enum
 *
 */
public enum Planet {
    //数据不真实
    MERCURY(3.302e+23, 2.434e6),  //枚举常量，也可以理解为是enum的一个实例
    VENUS(4.302e+23, 2.434e6),
    EARTH(5.302e+23, 2.434e6),
    MARS(6.302e+23, 2.434e6),
    SATURN(7.302e+23, 2.434e6);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67300E-11;
    Planet(double mass, double radius) {
        System.out.println(mass + " " + radius);
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {
        return mass;
    }
    public double radius() {
        return radius;
    }
    public double surfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }

    /**
     * 在加载enum的时候就已经生成实例了。
     * @param args
     */
    public static void main(String[] args) {
        double earthweight = Double.parseDouble("12");
        System.out.println("----------");
        double mass = earthweight / Planet.EARTH.surfaceGravity;
        System.out.println("----------");
        for (Planet p : Planet.values()) { //按照申明顺序返回值数组
            System.out.printf("Weight on %s is %f %n", p, p.surfaceWeight(mass));
        }
    }
}
