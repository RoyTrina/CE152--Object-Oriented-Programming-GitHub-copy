package lectures.lab5;

public class TestSolids {
    public static void main(String[] args) {
        Cylinder a = new Cylinder(5.0, 10.0);
        Cone b = new Cone(5.0, 10.0);
        Sphere c = new Sphere(5);

        double vol = a.capacity();
        System.out.println(a);

        double area = a.area();
        System.out.println(a);
    }
}
