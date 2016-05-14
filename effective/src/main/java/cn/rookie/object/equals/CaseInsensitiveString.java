package cn.rookie.object.equals;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.object.equals
 * Description: 不满足对称性的
 */
public class CaseInsensitiveString {
    private final String string;

    public CaseInsensitiveString(String string) {
        if (string == null) {
            throw new NullPointerException("参数不能为空");
        }
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString) {
            return string.equalsIgnoreCase(((CaseInsensitiveString) obj).string);
        }

        if (obj instanceof String) {
            return string.equalsIgnoreCase((String) obj);
        }
        return false;
    }
    public boolean equalsRight(Object obj) {
        return obj instanceof CaseInsensitiveString && string.equalsIgnoreCase(((CaseInsensitiveString) obj).string);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(s.equals(cis)); //false
        System.out.println(cis.equals(s)); //true

        System.out.println(cis.equalsRight(s));
    }
}
