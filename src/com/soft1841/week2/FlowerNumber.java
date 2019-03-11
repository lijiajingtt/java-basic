package com.soft1841.week2;

import java.util.Scanner;

public class FlowerNumber {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number:");
        int number = scanner.nextInt();
        //定义百，十，个位数的变量
        int hundread;
        int ten;
        int digit;
        //算出百位数
        hundread = number / 100;
        //算出十位数
        ten = number & 100 / 10;
        //算个个位数
        digit = number & 10;
        //判断其是否为水仙花数（阿姆斯特朗数）
        if (number == hundread * hundread * hundread + ten * ten * ten + digit * digit * digit){
            System.out.println(number + "是水仙花数");
        } else {
            System.out.println(number + "不是水仙花数");
        }

    }
}
