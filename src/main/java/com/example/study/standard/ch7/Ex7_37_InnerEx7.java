package com.example.study.standard.ch7;

import java.awt.*;
import java.awt.event.*;
public class Ex7_37_InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occured!!!");
    }
}
