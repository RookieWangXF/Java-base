package cn.rookie.enumDesign;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.enumDesign
 * Description: 枚举类型就是用一组固定的常量组成合法值的类型。
 */
public class BaseEnum {

    /**
     * 使用一组int型的常量，叫做int枚举模式，也有String枚举模式
     * 1. 类型安全性差,没有命名空间
     * 2. 需要在编译时确认
     * 3. 无法便利获取所有的枚举类型
     * 4. 这里只是做了一个简单的替换
     */
    private static final int APPLE_FUJI = 0;
    private static final int APPLE_PIPPIN = 1;
    private static final int APPLE_GRANNY = 2;

    private static final int ORANGE_NAVEL = 0;
    private static final int ORANGE_TEMPLE = 1;
    private static final int ORANGE_BLOOD = 2;

    /**
     * 1. 没有可访问的构造器，是真正的final类型，也不允许扩展
     * 2. 传入的值一定会是Apple类型内部的值，公有的final类型，不可能传递其他的值
     */
    enum Apple{
        FUJI,PIPPIN,GRANNY;
    }

    enum ORANGE{
        NAVEL,TEMPLE,BLOOD;

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        BaseEnum baseEnum =new BaseEnum();
        System.out.println(baseEnum.APPLE_FUJI);
        System.out.println(baseEnum.ORANGE_BLOOD);

        System.out.println(Apple.FUJI);
        System.out.println(ORANGE.BLOOD);
    }
}
