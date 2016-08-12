package cn.rookie.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/12.
 * Package_name is cn.rookie.map
 * Description:
 */
public class ConcurrentHashMapDemoTest {

    @Test
    public void HashMapPut() throws Exception {
        ConcurrentHashMapDemo demo = new ConcurrentHashMapDemo();
        demo.threadPut(new HashMap<Integer, String>());
    }

    @Test
    public void HashtablePut() throws Exception {
        ConcurrentHashMapDemo demo = new ConcurrentHashMapDemo();
        demo.threadPut(new Hashtable<Integer, String>());
    }
    @Test
    public void ConcurrentHashPut() throws Exception {
        ConcurrentHashMapDemo demo = new ConcurrentHashMapDemo();
        demo.threadPut(new ConcurrentHashMap<Integer, String>());
    }
}