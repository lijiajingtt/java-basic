package com.soft1841.holiday;

import java.awt.*;

public class ShowGrid extends Frame {
    public ShowGrid(){
        super("GridLayout example");
        setLayout(new GridLayout(0,2));
        add(new Button("Button1"));
        add(new Button("Button2"));
        add(new Button("Button3"));
        add(new Button("Button4"));
        add(new Button("Button5"));
        add(new Button("Button6"));
        setSize(360,360);
        setVisible(true);
    }

    public static void main(String[] args) {
        ShowGrid gl = new ShowGrid();
    }
}
