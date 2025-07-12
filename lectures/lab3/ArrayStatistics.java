package lectures.lab3;

public class ArrayStatistics {
    public static double sum(double[] x) {
        int result = 0;
        for (double v : x) {
            result += v;
        }
        return result;
    }

    public static double mean(double[] x) {
        double sum = practice.lab3.ArrayStatistics.sum(x);
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
        for (double v : x) {
            if (v > max) max = v;
        }
        return max;
    }
}
