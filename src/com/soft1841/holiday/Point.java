package com.soft1841.holiday;

  class Point {
     int x,y;
     void setXY(int i, int j){
         x=i;y=j;
     }
}
class Circle extends Point{
     double r;
     double area(){
         return 3.14*r*r;
     }
}
