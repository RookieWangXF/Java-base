package cn.rookie.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/17.
 * Package_name is cn.rookie.array
 * Description:
 */
public class TranslateArrayTest {

    private TranslateArray translate;

    @Before
    public void setUp() {
        translate = new TranslateArray();
    }

    @Test
    public void translate() throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        arr = translate.translate(arr);
        print(arr);
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}