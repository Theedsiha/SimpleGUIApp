package com.example;

import javax.swing.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        JFrame frame = new JFrame("Simple Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();

        JButton add = new JButton("Add");

        t1.setBounds(50, 50, 150, 30);
        t2.setBounds(50, 100, 150, 30);
        add.setBounds(50, 150, 100, 30);
        result.setBounds(50, 200, 150, 30);

        frame.add(t1);
        frame.add(t2);
        frame.add(add);
        frame.add(result);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int res = calc.add(a, b);
                result.setText(String.valueOf(res));
            }
        });

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}