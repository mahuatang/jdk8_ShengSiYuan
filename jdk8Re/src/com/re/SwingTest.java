package com.re;

import javax.swing.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("my frame");
        JButton jButton = new JButton("my button");

        jButton.addActionListener(e -> {
            System.out.println("hello world");
        });

        myFrame.add(jButton);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
