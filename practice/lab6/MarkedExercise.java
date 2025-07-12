package practice.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tr17548 on 20/02/2018.
 */
public class MarkedExercise {
    public static List<Integer> reverseIntegers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--)
            result.add(list.get(i));
        return result;

    }
}
