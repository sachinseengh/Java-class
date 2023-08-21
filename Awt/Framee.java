
// package Awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// public class Framee extends Frame {
public class Framee {

    public Framee() {
        Frame frame = new Frame("First gui");




        
        Label label = new Label("Hello", 0);
        label.setBounds(400, 10, 100, 100);
        frame.add(label);


        TextField textField = new TextField("Write here...", 0);
        textField.setBounds(400,100,200,200);
        frame.add(textField);



        Button button = new Button("Click");
        button.setBounds(400, 320, 60, 40);
        button.setBackground(Color.red);
        button.setForeground(Color.green);
        frame.add(button);


        frame.setSize(1100, 1100);
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
