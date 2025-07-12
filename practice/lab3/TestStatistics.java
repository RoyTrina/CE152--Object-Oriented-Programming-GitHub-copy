package practice.lab3;

/**
 * Created by tr17548 on 31/01/2018.
 */

import java.util.Arrays;

import static practice.lab3.ArrayStatistics.*;

public class TestStatistics {
    public static void main(String[] args) {
        testStatistics(new double[]{1.0, -2.0, 3.0, -4.0, 5.0});
    }

    public static void testStatistics(double[] x) {
        System.out.println("Array = " + Arrays.toString(x));
        System.out.println("Sum = " + sum(x));
        System.out.println("Average = " + mean(x));
        System.out.println("Min = " + min(x));
        System.out.println("Max = " + max(x));
    }
}