package cn.rookie.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Rookie on 2016/8/12.
 * Package_name is cn.rookie.map
 * Description:
 */
public class ConcurrentHashMapDemo {

    private ConcurrentHashMap concurrentHashMap;
    private HashMap<Integer, String> hashMap = new HashMap<>();
    private Hashtable<Integer, String> hashtable = new Hashtable<>();

    public void threadPut(Map<Integer, String> map) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        map.put(j, j + "number");
                    }
                }
            });
            thread.start();
        }

    }

}
