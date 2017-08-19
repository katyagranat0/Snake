package Main.Java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UltimateSnake {
    private static void createAndShowGUI() {
        //Create and set up the window.
        int height = 768;
        int width = 1366;
        JFrame frame = new JFrame("UltimateSnake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("Test");
        emptyLabel.setPreferredSize(new Dimension(500, 500));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setLocation(width - 600,0);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}