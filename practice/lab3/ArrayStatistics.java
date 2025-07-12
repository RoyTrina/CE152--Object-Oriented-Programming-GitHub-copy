package practice.lab3;

/**
 * Created by tr17548 on 31/01/2018.
 * Used the website: https://stackoverflow.com/questions/17130521/java-method-to-sum-any-number-of-ints, https://stackoverflow.com/questions/19671453/how-do-i-get-the-max-and-min-values-from-a-set-of-numbers-entered for help.
 */
public class ArrayStatistics {
    public static double sum(double[] x) {
        double sum = 0;
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }

    public static double mean(double[] x) {
        double sum = ArrayStatistics.sum(x);
        return sum / x.length;
    }

    public static double min(double[] x) {
        double min = x[0];
        for (double elem : x) {
            if (elem < min)
                min = elem;
        }
        return min;
    }

    public static double max(double[] x) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) max = x[i];
        }
        return max;
    }
}

