package com.soft1841.sample1;
 interface DrawImage{
     public void draw();
 }
 class Rectangle implements DrawImage{
     public void draw(){
         System.out.println("画图形");
     }
 }
 class Square implements DrawImage{
     public void draw(){
         System.out.println("画正方形");
     }
 }
 class Diamond implements DrawImage{
     public void draw(){
         System.out.println("画菱形");
     }
 }
public class SpecialParallerlogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond() };
        for (int i=0; i < images.length; i++){
            images[i].draw();
        }
    }
}
