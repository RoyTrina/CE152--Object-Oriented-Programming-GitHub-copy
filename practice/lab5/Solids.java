package practice.lab5;

/**
 * Created by tr17548 on 14/02/2018.
 */
public class Solids {
    public static double volumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double surfaceSphere(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public static double volumeCylinder(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double surfaceCylinder(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static double volumeCone(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public static double surfaceCone(double radius, double height) {
        double d = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + d);
    }

    public static void main(String[] args) {
        System.out.println(volumeSphere(5));
        System.out.println(volumeCylinder(5, 10));
        System.out.println(surfaceCylinder(5, 10));
        System.out.println(volumeCone(5, 10));
        System.out.println(surfaceCone(5, 10));
        System.out.println(surfaceSphere(5));
    }
}