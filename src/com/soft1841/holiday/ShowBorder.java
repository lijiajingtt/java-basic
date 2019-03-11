package com.soft1841.holiday;

import java.awt.*;

public class ShowBorder extends Frame {
    public ShowBorder(){
        super("BorderLayout example");
        setLayout(new BorderLayout());
        add("East",new Button("东"));
        add("South",new Button("南"));
        add("West",new Button("西"));
        add("North",new Button("北"));
        add(new Button("中"));
        setVisible(true);
        setSize(300,300);
    }

    public static void main(String[] args) {
        ShowBorder bl = new ShowBorder();
    }
}
