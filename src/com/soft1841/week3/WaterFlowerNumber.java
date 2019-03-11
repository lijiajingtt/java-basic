package com.soft1841.week3;

public class WaterFlowerNumber {
    public static void main(String[] args) {
        int x=100;
        int digit,ten,hundred;
        while(x<1000)
        {
            hundred=x/100;
            digit=x%10;
            ten=x/10%10;
            if(hundred*hundred*hundred+ten*ten*ten+digit*digit*digit==x){
                System.out.println("水仙花数是"+x);
            }
            x++;

        }
    }
}
