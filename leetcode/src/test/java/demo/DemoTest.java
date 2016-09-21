package demo;

import company.zhaoyin.Demo;
import org.junit.Test;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
public class DemoTest {
    @Test
    public void doFindIsosceles() throws Exception {
        int[] ar = {9, 9, 8, 5, 5, 3, 3, 1, 1, 1};
        Demo.doFindIsosceles(ar);
    }

}