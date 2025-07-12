package lectures.lab8;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;

public class LayoutDemos {

    public static void main(String[] args) {
        helloWorldDemo();
        flowLayoutDemo();
        flowLayoutLeftDemo();
		borderLayoutDemo3();
        borderLayoutDemo();
        borderLayoutDemo2();
        gridLayoutDemo();
        JPanelWrapDemo();

    }

    public static void helloWorldDemo() {
        JFrame frame = new JFrame("Hello World");
        frame.getContentPane().setPreferredSize(new Dimension(400, 200));
        JButton button = new JButton("Hello World!");
        frame.add(button, CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void flowLayoutDemo() {
        JFrame frame = new JFrame("Flow Layout Demo");
        frame.getContentPane().setPreferredSize(new Dimension(300, 200));
        frame.setLayout(new FlowLayout());
        for (int i = 0; i < 12; i++) {
            JButton jb = new JButton("Button " + i);
            frame.add(jb);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void flowLayoutLeftDemo() {
        JFrame frame = new JFrame("Flow Layout Demo (LEFT)");
        frame.getContentPane().setPreferredSize(new Dimension(300, 200));
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        frame.setLayout(layout);
        for (int i = 0; i < 12; i++) {
            JButton jb = new JButton("Button " + i);
            frame.add(jb);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void borderLayoutDemo() {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.getContentPane().setPreferredSize(new Dimension(300, 200));
        frame.add(new JButton("North"), NORTH);
        frame.add(new JLabel("East"), EAST);
        frame.add(new JButton("South"), SOUTH);
        frame.add(new JLabel("West"), WEST);
        frame.add(new JButton("Center"), CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void borderLayoutDemo3() {
        JFrame frame = new JFrame("BorderLayout Demo 3");
        frame.getContentPane().setPreferredSize(new Dimension(300, 200));
        frame.add(new JButton("North"), NORTH);
        frame.add(new JLabel("East"), EAST);
        frame.add(new JButton("South"), SOUTH);
        frame.add(new JLabel("West"), WEST);
        frame.add(new JButton("Center"), CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void borderLayoutDemo2() {
        JFrame frame = new JFrame("BorderLayout Demo with 4 Components");
        frame.add(new JButton("North"), NORTH);
        frame.add(new JLabel("East"), EAST);
        frame.add(new JButton("South"), SOUTH);
        frame.add(new JButton("Center"), CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void gridLayoutDemo() {
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setLayout(new GridLayout(4, 3));
        for (int i = 0; i < 12; i++) {
            JButton jb = new JButton("Button " + i);
            frame.add(jb);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void JPanelWrapDemo() {
        JFrame frame = new JFrame("JPanel Wrapping Demo");
        frame.setLayout(new GridLayout(4, 3));
        for (int i = 0; i < 12; i++) {
            JPanel jp = new JPanel();
            JButton jb = new JButton("Button " + i);
            jp.add(jb);
            frame.add(jp);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
