
// package Awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// public class Framee extends Frame {
public class Framee {

    public Framee() {
        Frame frame = new Frame("First gui");
        Button button = new Button("Click");
        button.setBounds(40, 60, 60, 40);
        frame.add(button);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Framee();
    }
}
