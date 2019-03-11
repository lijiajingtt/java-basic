package com.soft1841.holiday;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProgramWithAdapter extends Frame {
    WindowCloser listener = new WindowCloser();
    public ProgramWithAdapter(){
        addWindowListener(listener);
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgramWithAdapter();
    }
}
     class WindowCloser extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.out.println("要退出了");
        System.exit(0);
    }
}
