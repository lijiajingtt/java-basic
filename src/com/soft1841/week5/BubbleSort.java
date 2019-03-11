package com.soft1841.week5;

import java.util.Random;

   public class BubbleSort{
    public static void main(String[] args) {
        final int N = 8;
        int[] numbers = new int[N];
        Random random = new Random();
        for(int i = 0; i < N; i++){
            numbers[i] = random.nextInt(100);
        }
        //遍历一维数组
        System.out.print("排序前：");

        for (int n:numbers
        ) {
            System.out.print(n+ "  ");
        }
        //外层循环控制排序趟数
        int t;
        for(int i = 0; i < N-1; i++){
            //内层循环控制每趟的排序次数
            for (int j = i+1; j < N; j++){
                if (numbers[i] > numbers[j]){
                    t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
        System.out.print("\n排序后:");

        for (int n:numbers
        ) {
            System.out.print(n+ "  ");
        }
    }
}