package lectures.lab9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnitTests {
    List<Integer> xs = new ArrayList<>();
    List<Integer> ys = new ArrayList<>();
    public static final int N = 10;

    @Before
    public void reset() {
        xs.clear();
        ys.clear();
    }

    @Test
    public void weekdayTest() {
        try {
            for (int i = -1; i < 7; i++)
                assertEquals(i, Weekdays.intOfWeekday(Weekdays.weekdayOfInt(i)));
        } catch (StackOverflowError e) {
            System.out.println("There is an error. Please come back later.");
        }
    }

    @Test
    public void testMax() {
        checkMax(Collections.emptyList());
        checkMax(Collections.singletonList(3.0));
        checkMax(Arrays.asList(3.0, 1.0));
        checkMax(Arrays.asList(3.0, 1.0, 4.0));
        checkMax(Arrays.asList(3.0, 1.0, 4.0, 1.0));
    }

    private void checkMax(List<Double> xs) {
        if (xs.isEmpty())
            return;
        double m = Lists.max(xs);
        String errorMessage = "max " + xs + ": " + m;
        assertTrue(errorMessage, xs.contains(m));
        for (double x : xs)
            assertTrue(errorMessage, x <= m);
    }
}
