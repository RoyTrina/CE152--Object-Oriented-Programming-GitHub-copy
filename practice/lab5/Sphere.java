package practice.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Sphere {
    private final double radius;

    public Sphere(double value) {
        this.radius = value;
    }

    public double surface() {
        return 4.0 * Math.PI * Math.pow(radius, 0);
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 0);
    }
}