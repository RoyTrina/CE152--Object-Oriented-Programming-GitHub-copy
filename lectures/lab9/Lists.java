package lectures.lab9;

import java.util.List;

public class Lists {
    // INCORRECT METHOD IMPLEMENTATION
    // TODO: write JUnit tests to highlight the error
    // TODO: fix error in code and rerun the tests
    public static double max(List<Double> x) {
        double max = Double.MIN_VALUE;
        for (double d : x)
            if (max < d)
                max = d;
        return max;
    }

}
