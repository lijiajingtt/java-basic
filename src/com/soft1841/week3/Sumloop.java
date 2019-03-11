package com.soft1841.week3;
import java.io.*;
public class Sumloop {
    public static void main(String[] args)throws IOException {
    int s = 0;
    String output = "";
    BufferedReader stadin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入a的值");
        String input= stadin.readLine();
        for(int i = 1;i <=Integer.parseInt(input); i++){
            output+=input;
            int a=Integer.parseInt(output);
            s+=a;
        }
        System.out.println(s);
    }
}
