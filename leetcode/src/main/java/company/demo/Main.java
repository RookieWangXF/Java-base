package company.demo;

/**
 * 复制下边的所有内容
 * 1. 使用scanner接受所有参数
 * 2. 结果输出到页面上
 */

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int m;
        double sum,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            sum=0;
            for(int i=0;i<m;i++){
                sum=sum+n;
                n=Math.sqrt(n);
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }
}

