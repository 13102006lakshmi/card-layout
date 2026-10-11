
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Card Layout");

        CardLayout cl = new CardLayout();
        JPanel p = new JPanel(cl);

        p.add(new JButton("Card 1"), "First");
        p.add(new JButton("Card 2"), "Second");
        p.add(new JButton("Card 3"), "Third");

        JButton next = new JButton("Next");

        next.addActionListener(e -> cl.next(p));

        f.add(p, BorderLayout.CENTER);
        f.add(next, BorderLayout.SOUTH);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
