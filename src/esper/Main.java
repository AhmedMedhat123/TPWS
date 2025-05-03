/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import javax.swing.JFrame;
import javax.swing.*;
import view.TPWSDashboard;

/**
 *
 * @author Ahmed medhat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            // Create a new frame
            JFrame frame = new JFrame("TPWS Dashboard");
            
            // Create dashboard instance
            TPWSDashboard dashboard = new TPWSDashboard();
            
            // Set the content to your JPanel
            frame.setContentPane(dashboard);

            // Set frame settings
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(816, 821);
            frame.setLocationRelativeTo(null); // center on screen
            
            // Add window listener to handle cleanup when closing
            frame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    // Call cleanup method before closing
                    dashboard.cleanup();
                }
            });
            
            frame.setVisible(true);
        });
    }
}