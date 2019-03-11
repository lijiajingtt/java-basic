package com.soft1841.holiday;

import javafx.scene.layout.Pane;

import java.awt.*;

public class TestPanel extends Frame {
    Panel p1;
    Panel p2;
    TextArea textArea;
    TextField textField;
    Label lb;
    Button north,west,south;
    public TestPanel(){
        super("容器嵌套");
        p1 = new Panel();
        p1.setBackground(Color.gray);
        p2 = new Panel();
        p2.setBackground(Color.red);
         lb= new Label("我在第一个Panel里");
        textField = new TextField("我在第二个Panel里");
        textArea = new TextArea("我不在Panel里");
        north = new Button("North");
        west = new Button("West");
        south = new Button("South");
        p1.add(north); p1.add(lb);
        p2.add(south); p2.add(textField);
        add(p1,"North");
        add(west,"West");
        add(p2,"South");
        add(textArea);
        setVisible(true);
        setSize(360,360);
    }

    public static void main(String[] args) {
        TestPanel testPanel = new TestPanel();
    }
}
