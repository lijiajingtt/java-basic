package com.soft1841.holiday;

public class Test3 {
    public static void main(String args[]){
        String s = "Welcome to java World!";
        String s1 = "sun java";
        System.out.println(s.startsWith("Welcome"));//true
        System.out.println(s.endsWith("World"));//false
        String sL = s.toLowerCase();
        String sU = s.toUpperCase();
        System.out.println(sL);//welcome to java world!
        System.out.println(sU);//WELCOME TO JAVA WORLD!
        String subS = s.substring(11);
        System.out.println(subS);//java World!
        String st = s1.trim();
        System.out.println(st);//sun java
    }
}
