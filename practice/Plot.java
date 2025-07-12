package practice;

import javax.swing.*;
import java.awt.*;

public class Plot {

    //dimensions of plotting area with default values
    private static final int width = 600;
    private static final int height = 600;

    //dimensions of user-space coordinates with default values
    private static double xmini = 0, xmaxi = 1, ymini = 0, ymaxi = 1;

    //transformation of coordinates
    private static int scaleX(double x) {
        return (int) (width * (x - xmini) / (xmaxi - xmini));
    }

    private static int scaleY(double y) {
        return (int) (height * (ymini - y) / (ymaxi - ymini) + height);
    }

    private static void setScaleX() {
        xmini = 0.0;
        xmaxi = Math.PI;
    }

    private static void setScaleY() {
        ymini = -2.0;
        ymaxi = 2.0;
    }

    public class PlotFunction extends JComponent {
        public void main(String[] args) {
            Plot.setScaleX();
            Plot.setScaleY();
            JFrame f = new JFrame();
            //have to make the frame a bit bigger than the plotting area
            f.setSize(Plot.width + 20, Plot.height + 40);
            f.add(new PlotFunction());
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
    }

    public void paintComponent(Graphics g) {
        int N = 1000;
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            double xi = Math.PI * i / N;
            x[i] = Plot.scaleX(xi);
            y[i] = Plot.scaleY(Math.sin(4 * xi) + Math.sin(20 * xi));
        }
        g.drawPolyline(x, y, N);
    }
}
