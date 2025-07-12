package lectures.lab3;

import java.util.Arrays;

import static lectures.lab3.ArrayStatistics.*;

public class TestStatistics {
    public static void main(String[] args) {
        testStatistics(new double[]{1.0, -24.0, 3.0, -15.0, 50.0});
    }

    public static void testStatistics(double[] x) {
        System.out.println("Array = " + Arrays.toString(x));
        System.out.println("Sum = " + sum(x));
        System.out.println("Average = " + mean(x));
        System.out.println("Min = " + min(x));
        System.out.println("Max = " + max(x));
    }
}
