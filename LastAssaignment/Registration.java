//package testdb;

import javax.swing.*;
// import java.awt.*;

public class Registration {
    // static final String DB_URL="jdbc:mysqli://localhost/Employee";
    // static final String USER="root";
    // static final String PASS="";

    JFrame jf;
    // JButton submit;
    JTextField user,pass;
    JLabel ul, up, info;

    /**
     * 
     */
    Registration() {
        jf = new JFrame("User Registration");

        info = new JLabel("User Registration");
        info.setBounds(100, 10, 200, 10);
        jf.add(info);

        ul = new JLabel("Enter Username");
        ul.setBounds(100, 20, 200, 30);
        jf.add(ul);

        user = new JTextField();
        user.setBounds(100, 70, 200, 30);
        jf.add(user);

        up = new JLabel("Enter Password");
        up.setBounds(100, 110, 200, 30);
        jf.add(up);

        pass = new JTextField("55");
        pass.setBounds(100, 150, 200, 30);
        jf.add(pass);

        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setLayout(null);

    }

    public static void main(String[] args) {

        new Registration();

    }
}