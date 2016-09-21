package cn.rookie.math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/21.
 * Description:
 */
@RunWith(Parameterized.class)
public class NumberOf1Test {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 32, -1 }, { 1, 4 }, { 1, 8 }, { 2,5 }, {2, 10}, { 3, 11 }
        });
    }
    private int fInput;

    private int fExpected;

    public NumberOf1Test(int expected,int input){
        fInput= input;
        fExpected= expected;
    }

    @Test
    public void numberOf1() throws Exception {
        Assert.assertEquals(fExpected,NumberOf1.numberOf1(fInput));
    }

}