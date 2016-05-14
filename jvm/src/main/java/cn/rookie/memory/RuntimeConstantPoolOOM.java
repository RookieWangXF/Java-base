package cn.rookie.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.memory
 * Description:运行时常量池溢出
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
