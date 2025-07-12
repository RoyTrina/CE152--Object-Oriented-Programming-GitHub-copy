package practice.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Cylinder {
    private final double radius;
    private final double height;

    public Cylinder(double value) {
        this.radius = value;
        this.height = value;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double capacity() {
        return Math.PI * Math.pow(radius, 2) * height;

    }
}