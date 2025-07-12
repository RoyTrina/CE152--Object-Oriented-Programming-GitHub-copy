package practice;

import lectures_programs.Drawing2;

import javax.swing.*;
import java.awt.*;

public class Randomballs extends JComponent {
    public static void main(String[] args) {
        JFrame f = new JFrame("Random colourful balls");
        f.setSize(400, 400);
        f.add(new Drawing2());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {

    }

}