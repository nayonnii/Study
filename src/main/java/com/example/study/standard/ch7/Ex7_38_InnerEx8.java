package com.example.study.standard.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* Ex7_37을 익명클래스로 구현 */
public class Ex7_38_InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {  // ActionListener 인터페이스를 익명클래스로 구현
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
                }
            }
        );
    }
}
