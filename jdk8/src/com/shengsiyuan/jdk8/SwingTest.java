package com.shengsiyuan.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by YURUIThink on 2017/2/8.
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Jframe");
        JButton jButton = new JButton("My JButton");

        jButton.addActionListener(e -> {//类型推断
                System.out.println("wo kao");
                System.out.println("Button Pressed haha");
        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
