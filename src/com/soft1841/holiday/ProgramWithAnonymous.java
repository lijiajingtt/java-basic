package com.soft1841.holiday;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProgramWithAnonymous extends Frame {
    public ProgramWithAnonymous(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgramWithAnonymous();
    }
}
