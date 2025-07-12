package lectures.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Cylinder {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double capacity() {
        return Math.PI * Math.pow(radius, 2) * height;

    }

    public String toString() {
        return toString();
    }
}