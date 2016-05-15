package cn.rookie.enumDesign;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.enumDesign
 * Description:枚举中必须要有实例变量，类比为对象
 */
enum Demo{
    MONDAY(1,2);
    private final int area ;
    private final int length;
    private final int width;

    Demo(int length, int width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }
    public int getArea(){
        return area;
    }

    public static void main(String[] args) {
        System.out.println(Demo.MONDAY.getArea());
        System.out.println(Demo.valueOf("MONDAY").getClass());
    }
}
