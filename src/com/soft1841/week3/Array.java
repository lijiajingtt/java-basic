package com.soft1841.week3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入s=a+aa+aaa+aaaa+aa...a中a的值");
        int a = in.nextInt();
        System.out.println("请输入加数个数");
        int t = in.nextInt();
        int array[] = new int[t];
        array[0] = a;
        int result = array[0];
        for (int i =1; i< array.length; i++){
            array[i] = array[i - 1]* 10 + a;
            result += array[i];
        }
        System.out.println(result);
    }
}
