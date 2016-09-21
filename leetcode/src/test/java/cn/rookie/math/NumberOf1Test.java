package cn.rookie.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
public class NumberOf1Test {
    @Test
    public void numberOf1() throws Exception {
        Assert.assertEquals(2,NumberOf1.numberOf1(3));
    }
    @Test
    public void numberOf12() throws Exception {
        Assert.assertEquals(0,NumberOf1.numberOf1(-1));
    }
    @Test
    public void numberOf13() throws Exception {
        Assert.assertEquals(1,NumberOf1.numberOf1(4));
    }
}