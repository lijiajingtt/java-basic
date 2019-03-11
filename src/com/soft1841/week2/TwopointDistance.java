package com.soft1841.week2;

import java.util.Random;

public class TwopointDistance {
    /**
     * 两点之间距离计算
     * @author 家劲
     * 2018.10.17
     */

    public static class DistanceCalculation {
        public static void main(String[] args) {
            int X1;
            int X2;
            int Y1;
            int Y2;
            double square;
            Random random = new Random();
            X1 = random.nextInt(1000);
            X2 = random.nextInt(1000);
            Y1 = random.nextInt(1000);
            Y2 = random.nextInt(1000);
            square =( (X2-X1) * (X2-X1) + (Y2-Y1) * (Y2-Y1));
            double distance = Math.sqrt(square);
            System.out.println("点（"+X1+","+Y1+")"+"和点（"+X2+","+Y2+")"+"之间的距离是："+distance);

        }
    }
}
