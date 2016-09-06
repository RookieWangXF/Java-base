package demo1;

import java.util.*;

/**
 * Created by Rookie on 2016/8/17.
 * Package_name is demo1
 * Description:
 */
public class Main {

    public static int[] getFromN(int[] arr, int n, int k) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < k; i++) {
            int p1 = n, p2 = 2 * n, p3 = 0;
            for (int j = 0; j < n; j++) {
                temp[p3++] = arr[--p2];
                temp[p3++] = arr[--p1];
            }
            for (int j = 0; j < 2 * n; j++) {
                arr[j] = temp[j];
            }
        }
        return arr;
    }

    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Integer length;
        length = cin.nextInt();
        int[] value = new int[2];
        ArrayList list = new ArrayList();
        for (int i = 0; i < length;i++) {
            value[0] = cin.nextInt();
            value[1] = cin.nextInt();
            int[] arr = new int[value[0] * 2];
            for (int j = 0; j < 2 * value[0]; j++) {
                arr[j] = cin.nextInt();
            }
            int[] res = getFromN(arr, value[0], value[1]);
            for (int j = 0; j < res.length - 1; j++) {
                list.add(res[j]);
                list.add(" ");
            }
            /*for (int j = res.length - 1; j > 0; j--) {
                list.add(res[j]);
                list.add(" ");
            }*/
            list.add(res[2 * value[0] - 1]);
            list.add("\n");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
