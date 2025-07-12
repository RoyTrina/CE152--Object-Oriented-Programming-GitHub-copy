package lectures.Start;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Mandelbrot extends JComponent {
    final static int N = 800;
    static BufferedImage im = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
}
