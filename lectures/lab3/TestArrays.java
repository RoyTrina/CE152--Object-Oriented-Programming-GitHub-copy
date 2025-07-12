package lectures.lab3;

import java.util.Arrays;

import static lectures.lab3.Arrays.reverse;

public class TestArrays {
    public static void main(String[] args) {
        testReverse(new int[]{1, 2, 3, 4, 5});
        testReverseCopy(new int[]{1, 2, 3, 4, 5});
    }

    public static void testReverse(int[] array) {
        System.out.println("### test: reverse");
        System.out.println("array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("method call: reverse(array)");
        System.out.println("array = " + Arrays.toString(array) + "\n");
    }

    public static void testReverseCopy(int[] testArray) {

    }
}
