package com.soft1841.week3;

public class StudentNo {
    public static void main(String[] args) throws InterruptedException {
        int i=1;
        while (i<=40){
            if(i<10){
                System.out.println("学号为：180234330"+ i);
            } else{
                System.out.println("学号为：18023433" +i);
            }
            i++;
                Thread.sleep(1000);
            }
        }
    }

