package cn.rookie.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/25.
 * Package_name is cn.rookie.array
 * Description:
 */
public class FindInPartiallySortedMatrixTest {
    @Test
    public void find() throws Exception {
        int[][] arr = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = ((i + j) * j) << 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        FindInPartiallySortedMatrix find = new FindInPartiallySortedMatrix();
        System.out.println(find.find(arr,72));
        System.out.println(find.find(arr,60));
        System.out.println(find.find(arr,12));
        System.out.println(find.find(arr,1));
    }

}