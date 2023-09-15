
// package LastAssaignment;
import javax.swing.*;
import java.awt.*;

public class Q2BorderLayout {

    JFrame f;
    JButton E, W, N, S, C;

    Q2BorderLayout() {
        f = new JFrame("BorderLayout");

        N = new JButton("North", null);
        f.add(N, BorderLayout.NORTH);

        S = new JButton("South", null);
        f.add(S, BorderLayout.SOUTH);

        E = new JButton("East", null);
        f.add(E, BorderLayout.EAST);

        W = new JButton("West", null);
        f.add(W, BorderLayout.WEST);

        C = new JButton("Center", null);
        f.add(C, BorderLayout.CENTER);

        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q2BorderLayout();

    }
}
