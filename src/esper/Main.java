package esper;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import view.LoginForm;
import view.TPWSDashboard;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create and show login form first
            showLoginForm();
        });
    }
    
    private static void showLoginForm() {
        JFrame loginFrame = new JFrame("TPWS Login");
        LoginForm loginForm = new LoginForm();
        
        loginFrame.setContentPane(loginForm);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(381, 298);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
    
    public static void showDashboard() {
        JFrame frame = new JFrame("TPWS Dashboard");
        TPWSDashboard dashboard = new TPWSDashboard();
        
        frame.setContentPane(dashboard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(816, 821);
        frame.setLocationRelativeTo(null);
        
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                dashboard.cleanup();
            }
        });
        
        frame.setVisible(true);
    }
}