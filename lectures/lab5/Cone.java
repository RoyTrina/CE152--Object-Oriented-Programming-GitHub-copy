package lectures.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Cone {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        double d = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        double area = Math.PI * radius * (radius + d);
        return area;
    }

    public double capacity() {
        double capacity = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        return capacity;

    }

    public String toString() {
        return toString();
    }
}
