package com.example.mavenmock;

import java.awt.event.ActionEvent;

import java.awt.event.*;

public class EventListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("You have clicked the ACTIVE button  times");
    }
}
