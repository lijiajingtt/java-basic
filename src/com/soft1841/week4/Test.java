package com.soft1841.week4;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i<=4; i++){
            for (int j = 4; j>i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
