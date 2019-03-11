package com.soft1841.week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     final int COUNT = 5;
     int n;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int min = 2000;
        int max = -88888;
        for (int i = 0; i <=COUNT;i++){
            System.out.println("请您输入一个数");
            n = scanner.nextInt();
            if (n >max){
                max = n;
            }
            if (n <min){
                min = n;
            }
            sum +=n;
        }
        System.out.println("最小值="+min+ "最大值="+max+ "sum="+sum);
    }
}
