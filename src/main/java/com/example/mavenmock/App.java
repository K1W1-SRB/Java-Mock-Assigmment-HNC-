// Sebastian Somogyi 22006906 This program has 3 Functions 1 generates a password 2nd show factroial of number and last one to exit program 

package com.example.mavenmock;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;
import java.math.BigInteger;

class App {

    public static void main(String args[]) {
        JFrame f = new JFrame("Mock-assesment");
        // set size and location of frame
        f.setSize(800, 300);
        f.setLocation(100, 150);
        // make sure it quits when x is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set look and feel declaratons of buttons and dimensions
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

        // Event listeners for clicks on buttons

        // Factorial for Password Button
        Button1.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // when button is clicked than InputDialogs appear
                String firstName;
                firstName = JOptionPane.showInputDialog("Please enter your first name");
                String lastName;
                lastName = JOptionPane.showInputDialog("Please enter your last name");
                char firstChar;
                firstChar = firstName.charAt(0); // gets first character of first name
                char firstChar2 = Character.toLowerCase(firstChar); // makes it lowercase
                String password;
                password = firstChar2 + lastName.toUpperCase(); // adds the first character and adds the lastname all
                                                                // uppercase
                JOptionPane.showMessageDialog(null, password);// outputs the password
            }
        });
        // listeners for the factorial button
        Button2.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String input;
                int InputValue;
                input = JOptionPane.showInputDialog("Please enter a number to go through the factorial function");
                try {
                    InputValue = Integer.parseInt(input);
                    return InputValue;
                } catch (NumberFormatException p) {
                    System.out.println("Input String cannot be parsed to Integer.");
                }

                // Factorial Algorithm
                BigInteger factorial = BigInteger.ONE;

                int n = InputValue;

                for (int i = 1; i <= n; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                JOptionPane.showMessageDialog(null, "Factorial of " + InputValue + " is " + factorial);
            }
        });
        // listeners for the Bye Button
        Button3.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // pop up to verify that u want to exit the program
                int result = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to quit?",
                        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
    }
}
