package com.example.mavenmock;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

class App {

    public static void main(String args[]) {
        JFrame f = new JFrame("Mock-assesment");
        // set size and location of frame
        f.setSize(800, 300);
        f.setLocation(100, 150);
        // make sure it quits when x is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set look and feel
        JButton Button1 = new JButton("Generate Username");
        Button1.setBounds(10, 10, 200, 50);
        Button1.getActionListeners();
        JButton Button2 = new JButton("Factorial");
        Button2.setBounds(250, 10, 200, 50);
        JButton Button3 = new JButton("Bye");
        Button3.setBounds(500, 10, 200, 50);

        // add elements to the frame
        f.add(Button1);
        f.add(Button2);
        f.add(Button3);
        f.setLayout(null);
        f.setVisible(true);

        Button1.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String firstName;
                firstName = JOptionPane.showInputDialog("Please enter your first name");
                String lastName;
                lastName = JOptionPane.showInputDialog("Please enter your last name");
                char firstChar;
                firstChar = firstName.charAt(0);
                char firstChar2 = Character.toLowerCase(firstChar);
                String password;
                password = firstChar2 + lastName.toUpperCase();
                JOptionPane.showMessageDialog(null, password);
            }
        });
        Button2.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String input;
                input = JOptionPane.showInputDialog("Please enter a number to go through the factorial function");
                int InputValue = Integer.valueOf(input);
                int i = 1;
                int fact = 1;
                for (i = 1; i <= InputValue; i++) {
                    fact = fact * i;
                }
                JOptionPane.showMessageDialog(null, "Factorial of " + InputValue + " is " + fact);
            }
        });
        Button3.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int result = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to quit?",
                        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
    }
}
