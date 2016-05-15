package cn.rookie.object.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.object.hash
 * Description:
 */
public class PhoneNumberRight {

    //实现hashcode的一个缓存，如果类不是经常可变的，计算代价比较大，可以在加载时候缓存。
    private volatile int hashcode;

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;


    public PhoneNumberRight(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 999, "line Number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + " : " + arg);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumberRight)) {
            return false;
        }

        PhoneNumberRight pn = (PhoneNumberRight) obj;
        return pn.lineNumber == lineNumber &&
                pn.areaCode == areaCode &&
                pn.prefix == prefix;
    }


    public static void main(String[] args) {
        //由于覆盖hashcode方法,map中可以找到对应的key
        Map<PhoneNumberRight, String> m = new HashMap<PhoneNumberRight,String>();
        m.put(new PhoneNumberRight(707, 867, 309), "Jeney");
        System.out.println(m.get(new PhoneNumberRight(707, 867, 309)));


    }

    @Override
    public int hashCode() {
        int result = hashcode;
        if (hashcode == 0) {
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashcode = result;
        }

        return result;
    }
}
