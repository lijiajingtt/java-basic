package com.soft1841.week3;

import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner a = new Scanner(System.in);
        int l = a.nextInt();
        for(int k = 2;k <= l/2;k++){
            if(l%k==0){
                System.out.print(k+"*");
                l= l/k;  //用递归把n重新定值
                k=2;//让for循环重新执行
            }
        }
        System.out.println(l);//把最后一个质因数输出
    }
}
