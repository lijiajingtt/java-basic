package com.soft1841.holiday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTest extends Frame implements ActionListener {
    private MenuItem fileNew = new MenuItem("New");
    private MenuItem fileOpen = new MenuItem("Open");
    private MenuItem fileExit = new MenuItem("Exit");
    private MenuItem editCut = new MenuItem("Cut");
    private MenuItem editCopy = new MenuItem("Copy");
    private MenuItem editPaste = new MenuItem("Paste");
    TextArea textArea = new TextArea();
    public MenuTest(){
        super("Menu Test Program");
        Menu file = new Menu("File");
        file.add(fileNew); fileNew.setEnabled(false);
        file.add(fileOpen); fileOpen.setEnabled(false);
        file.addSeparator();
        file.add(fileExit); fileExit.setEnabled(true);
        Menu edit = new Menu("Edit");
        edit.add(editCut); editCut.setEnabled(false);
        edit.add(editCopy); editCopy.setEnabled(false);
        edit.add(editPaste); editPaste.setEnabled(false);
        MenuBar bar = new MenuBar();
        bar.add(file);
        bar.add(edit);
        setMenuBar(bar);
        fileExit.addActionListener(this);
        setSize(300,200);
        setVisible(true);
        add(textArea);
    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == fileExit){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        MenuTest f = new MenuTest();
    }
}
