package practice.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by tr17548 on 21/02/2018.
 */
public class TestLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3, 2, 1, 4, 5);
        testReverseIntegers(numbers);
    }

    public static void testReverseIntegers(List<Integer> numbers) {
        System.out.println(numbers);
        System.out.println("Test: reverseIntegers");
        System.out.println(practice.lab6.MarkedExercise.reverseIntegers(numbers) + "\n");
    }

    public static void product() {
        int list = 0;
        out.println(list);
        out.println("Test: multiplyIntegers");
        //  out.println(MarkedExercise.reverseIntegers(digits) + "\n");
    }
}
