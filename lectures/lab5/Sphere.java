package lectures.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double surface() {
        double surface = 4.0 * Math.PI * Math.pow(radius, 0);
        return surface;
    }

    public double volume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 0);
        return volume;
    }

    public String toString() {
        return toString();
    }

}