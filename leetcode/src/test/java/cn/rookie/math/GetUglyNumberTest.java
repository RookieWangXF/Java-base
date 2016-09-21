package cn.rookie.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/20.
 * Description:
 */
public class GetUglyNumberTest {

    private GetUglyNumber demo;
    @Before
    public void setUp() throws Exception {
        demo = new GetUglyNumber();
    }

    @Test
    public void getUglyNumber_Solution() throws Exception {
        Assert.assertEquals(0,demo.getUglyNumber_Solution(-1));
    }

    @Test
    public void getUglyNumber_Solution2() throws Exception {
        Assert.assertEquals(0,demo.getUglyNumber_Solution(0));
    }

    @Test
    public void getUglyNumber_Solution3() throws Exception {
        Assert.assertEquals(15,demo.getUglyNumber_Solution(11));
    }


}