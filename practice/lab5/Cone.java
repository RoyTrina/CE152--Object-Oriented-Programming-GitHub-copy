package practice.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Cone {
    private final double radius;
    private final double height;

    public Cone(double value) {
        this.radius = value;
        this.height = value;
    }

    public double area() {
        double d = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + d);
    }

    public double capacity() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

    }
}
