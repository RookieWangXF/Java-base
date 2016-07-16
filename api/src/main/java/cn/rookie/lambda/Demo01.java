package cn.rookie.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Rookie on 2016/6/12.
 * Package_name is cn.rookie.lambda
 * Description:
 */
public class Demo01 {

    public void base() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            System.out.println(number);
        }

        numbers.forEach((Integer value) -> System.out.println(value));
    }

    public int sumAll(List<Integer> list, Predicate<Integer> p){
        int total = 0;
        for (int number : list) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.base();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(demo01.sumAll(numbers, n -> true));
        System.out.println(demo01.sumAll(numbers, n -> n % 2 == 0));
        System.out.println(demo01.sumAll(numbers, n -> n > 3));
    }
}
