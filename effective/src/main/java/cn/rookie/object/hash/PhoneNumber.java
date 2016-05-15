package cn.rookie.object.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.object.hash
 * Description:
 */
public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;


    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
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
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) obj;
        return pn.lineNumber == lineNumber &&
                pn.areaCode == areaCode &&
                pn.prefix == prefix;
    }


    public static void main(String[] args) {
        //由于没有覆盖hashcode方法，导致两个相等的实例具有不同的hashcode码，
        Map<PhoneNumber, String> m = new HashMap<PhoneNumber,String>();
        m.put(new PhoneNumber(707, 867, 309), "Jeney");
        System.out.println(m.get(new PhoneNumber(707, 867, 309)));

        //当hashcode方法直接返回一个固定值的时候，是将散列表的复杂度转化为了链表


    }

}
