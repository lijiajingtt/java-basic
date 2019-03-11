package com.soft1841.week3;

import java.util.Scanner;

public class Factotial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("请输入一个正整数");
        int number;
        //定义初始值
        int x = 1;
        number = scanner.nextInt();
        //设置循环条件，输入的数字确保要大于0
        while (number>0){
            x = x*number;
            number--;
        }
        System.out.println("计算出数的阶乘为" +x);
    }
}
