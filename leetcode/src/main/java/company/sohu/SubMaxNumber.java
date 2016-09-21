package company.sohu;

import java.util.LinkedList;
import java.util.Scanner;

public class SubMaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberString = sc.nextLine();
        int count = sc.nextInt();
        if (numberString == null || numberString.length() == 0 || numberString.length() <= count)
            System.out.println(0);

        String[] strings = numberString.split("");
        LinkedList<Integer> numList = new LinkedList<>();
        for (String temp : strings) {
            numList.add(Integer.parseInt(temp));
        }

        while (count > 0) {
            int size = numList.size();
            for (int i = 0; i < size - 1; i++) {
                if (numList.get(i) < numList.get(i + 1)) {
                    numList.remove(i);
                    break;
                }
                if (i == size - 2) {
                    numList.remove(i + 1);
                }
            }
            count--;
        }
        numList.forEach(System.out::print);
        System.out.println();
    }
}