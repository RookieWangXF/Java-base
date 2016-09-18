package cn.rookie.array;

import cn.rookie.util.PrintUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/9/9.
 * Description:
 */
public class PrintMatrixInCircleTest {

    private int[][] arr;

    @Before
    public void setUp() {
        arr = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        PrintUtil.printMatrix(arr);
    }
    @Test
    public void printMatrixClockwisely() throws Exception {
        new PrintMatrixInCircle().printMatrixClockwisely(arr);
    }


}