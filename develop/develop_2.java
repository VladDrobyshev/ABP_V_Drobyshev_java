package develop;


import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.UIManager;

public class develop_2 {
    public static void code() {
        // Set the look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the color of the window bar
        UIManager.put("nimbusBase", new java.awt.Color(255, 0, 0));

        // Create and display a simple JFrame
        javax.swing.JFrame frame = new javax.swing.JFrame("Window Bar Color");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);


    }
}
