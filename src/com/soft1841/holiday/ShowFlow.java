package com.soft1841.holiday;

import java.awt.*;

public class ShowFlow extends Frame {
    public ShowFlow(){
        super("FlowLayout example");
        setSize(300,100);
        setLayout(new FlowLayout());
        add(new Button("Button1"));
        add(new Button("Button2"));
        add(new Button("Button3"));
        setVisible(true);
    }

    public static void main(String[] args) {
        ShowFlow flow = new ShowFlow();
    }
}
