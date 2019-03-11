package com.soft1841.week3;

import java.util.Random;

/**
 *  简单的验证码
 *  四位随机英文小写字母组成
 * @author 家劲
 * 2018.10.24
 */
public class SimpleVerifyCode {
    public static void main(String[] args) {
        String verifyCode = "";
        Random random = new Random();
        int n ;
        for (int i = 1;i <= 4; i++){
            n = random.nextInt( 27);
            verifyCode += (char) ('a' + n);
        }
        System.out.println(verifyCode);
    }
}
