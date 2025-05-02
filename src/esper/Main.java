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
            
            // Set the content to your JPanel
            frame.setContentPane(new TPWSDashboard());

            // Set frame settings
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(799, 660);
            frame.setLocationRelativeTo(null); // center on screen
            frame.setVisible(true);
        });
    }

}
