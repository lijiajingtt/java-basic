package com.soft1841.sample1;

abstract class Shape {
    abstract float getPerimeter();
    abstract float getArea();
}
class Rect extends Shape{
    float length=2;
    float hight=3;
    float getPerimeter(){
        return 2*(length + hight);
    }
    float getArea(){
        return length*hight;
    }
}
class Circle extends Shape{
    int r = 5;
    float PI=3.14f;
    float getPerimeter(){
        return 2*3.14f*r;
    }
    float getArea(){
        return 3.14f*r*r;
    }
}
class TestShape{
    public static void main(String[] args) {
        Rect rect=new Rect();
        Circle circle= new Circle();
        System.out.println("矩形周长：" +rect.getPerimeter());
        System.out.println("矩形面积：" +rect.getArea());
        System.out.println("圆形周长：" +rect.getPerimeter());
        System.out.println("圆形面积：" +rect.getArea());
    }
}
