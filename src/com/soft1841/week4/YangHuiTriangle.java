package com.soft1841.week4;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        PrintStream outtxt = new PrintStream(". /log_YangHuiTriangle.txt");
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int i, j;
        int sum = 1;
        for (i = 1; i <= count; i++) {
            for (j = count; j >= 1; j--) {
                System.setOut(out);
                System.out.print("");
                System.setOut(outtxt);
                System.out.print("");
            }
            for (j = 1; j <= i;j++){
                if (j > 1){
                    sum = sum * (i-j+1) / (j-1);
                    System.setOut(out);
                    System.out.print(sum+"");
                    System.setOut(outtxt);
                    System.out.print(sum+"");
                }else{
                    System.setOut(out);
                    System.out.print("1");
                    System.setOut(outtxt);
                    System.out.print("1");
                }
            }
            System.setOut(out);
            System.out.println("");
            System.setOut(outtxt);
            System.out.println("");
        }
    }
}