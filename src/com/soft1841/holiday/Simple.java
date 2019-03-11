package com.soft1841.holiday;

import java.applet.Applet;
import java.awt.*;

public class Simple extends Applet {
    StringBuffer buffer;
    public void init() {
        buffer = new StringBuffer();
        addItem("initializing...");
    }
    public  void start(){
        addItem("starting...");
    }
    public void stop(){
        addItem("stopping...");
    }
    public void destroy(){
        addItem("preparing for unloading...");
    }
    void addItem(String newWord){
        System.out.println(newWord);
        buffer.append(newWord);
        repaint();
    }
    public void paint (Graphics graphics){
        graphics.drawString(buffer.toString(),5,15);
    }
}
