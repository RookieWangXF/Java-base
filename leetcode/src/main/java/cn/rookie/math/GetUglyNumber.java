package cn.rookie.math;

/**
 * Created by Rookie on 2016/9/20.
 * Description:
 */
public class GetUglyNumber {

    public int getUglyNumber_Solution(int index) {
        if (index <= 0)
            return 0;
        int[] uglyNum = new int[index];
        uglyNum[0] = 1;
        int next = 1;

        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;

        while (next < index) {
            int min = Min(uglyNum[multiply2] * 2, uglyNum[multiply3] * 3, uglyNum[multiply5] * 5);
            uglyNum[next] = min;

            while (uglyNum[multiply2] *2 <= uglyNum[next])
                multiply2++;
            while (uglyNum[multiply3] *3 <= uglyNum[next])
                multiply3++;
            while (uglyNum[multiply5] *5 <= uglyNum[next])
                multiply5++;

            ++next;
        }

        return uglyNum[next - 1];
    }

    private int Min(int number1, int number2, int number3) {
        int min = (number1 < number2) ? number1 : number2;
        min = (min < number3) ? min : number3;
        return min;
    }
}
