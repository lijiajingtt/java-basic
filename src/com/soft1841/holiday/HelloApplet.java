package com.soft1841.holiday;

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    public String string;
    public void init(){
        string = new String ("Hello World");
    }
    public void paint (Graphics graphics){
        graphics.drawString(string,25,25);
    }
}

