import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addingtwo implements ActionListener {
    JTextField t1, t2, t3;
    JButton b1;
    JLabel l1, l2, l3;

    Addingtwo() {
        JFrame f = new JFrame("Adder");


        l1 = new JLabel("Enter your First number:");
        l1.setBounds(100,50,300,50);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(100, 100, 300, 100);

        t2 = new JTextField("Enter Second number");
        t2.setBounds(100, 220, 300, 100);

        b1 = new JButton("Add");
        b1.setBounds(100, 340, 300, 100);
        b1.addActionListener(this);

        t3 = new JTextField("Result");
        t3.setBounds(100, 450, 300, 100);
        t3.setEditable(false);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l1);
        f.add(b1);

        f.setSize(700, 700);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();


        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);


        int c=0;

        if(e.getSource() == b1){
            c = a+b;
        }


        String result = String.valueOf(c);
        t3.setText(result);

    }

    public static void main(String[] args) {
        new Addingtwo();
    }
}
