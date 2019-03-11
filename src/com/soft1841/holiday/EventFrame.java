package com.soft1841.holiday;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventFrame extends Frame {
    private Button quit = new Button("Quit");
    public EventFrame(){
        super("Test Event");
        setLayout(new FlowLayout());
        add(quit);
        setVisible(true);
        setSize(360,360);
        quit.addActionListener(new ButtonHandler());
    }

    public static void main(String[] args) {
        EventFrame mft = new EventFrame();
    }
}
     class ButtonHandler implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println("要退出了"+ e);
             System.exit(0);
         }
     }
