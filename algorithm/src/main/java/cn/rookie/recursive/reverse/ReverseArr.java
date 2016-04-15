package cn.rookie.recursive.reverse;

import java.util.Scanner;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class ReverseArr {
    public static void reverse(Scanner input) {
        if (input.hasNextLine()) {
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        ReverseArr.reverse(new Scanner(System.in));
    }
}
