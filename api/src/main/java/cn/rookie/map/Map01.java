package cn.rookie.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rookie on 2016/3/27.
 * Description: map是如何存储的呢
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class Map01 {
    HashMap<String, Object> map = new HashMap<String, Object>();
    //每个 Map.Entry 其实就是一个 key-value 对,实际是一个Entry的数组
    public void learn(){
        Set<Map.Entry<String,Object>> entries= map.entrySet();
    }


    int hashM(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static void main(String[] args) {
        System.out.println(-6 >>> 1);  //补的是0
        System.out.println(-6 >> 1);  //补的是符号位
        String ss = "adf";
        int h;
        System.out.println((h = ss.hashCode()) ^ (h>>>16));
        System.out.println(ss.hashCode());
    }
}
