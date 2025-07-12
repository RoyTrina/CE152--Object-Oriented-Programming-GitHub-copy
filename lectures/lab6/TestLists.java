package lectures.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 7, 1, 9, 10);
        testReverseIntegers(numbers);
    }

    public static void testReverseIntegers(List<Integer> list) {
        System.out.println("### Test: reverseIntegers");
        System.out.println(list);
        System.out.println(MarkedExercise.reverseIntegers(list) + "\n");
    }

    public static void product(int[] list) {
        int ar[] = {1, 4, 7, 8, 5};
        int n = ar.length;
    }
}
