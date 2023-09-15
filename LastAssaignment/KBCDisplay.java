import javax.swing.*;

public class KBCDisplay {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("KBC Display");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Create a JLabel to display "KBC"
        JLabel label = new JLabel("KBC");

        // Add the JLabel to the JPanel
        panel.add(label);

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Set JFrame properties
        frame.setSize(300, 100); // Set the size of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the JFrame is closed
        frame.setLocationRelativeTo(null); // Center the JFrame on the screen

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
