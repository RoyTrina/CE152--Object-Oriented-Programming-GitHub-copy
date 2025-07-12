package lectures.lab3;

import java.io.IOException;

public class RandomNumberExperiment {
    public static final int TRIES = 1_000_000;

    public static int[] experiment(final int n) {
        int[] randomNumbers = new int[10];
        for (int i = 0; i <= TRIES; i++) {
            randomNumber(n);
            if (n != randomNumber(n)) {
                randomNumbers[i] = n;
            }
            else{
                return randomNumbers;
            }
        }
        // TO DO:
        // method should invoke randomNumber(n) TRIES number of times
        // it should use an array to keep track how often each random number has occurred
        // it should return this array
        return new int[]{0};
    }

    public static int randomNumber(int n) {
        return (int) (Math.random() * n);
    }

    public static void main(String[] args) throws IOException {
        final int N = 10;
        System.out.println("### Frequency of randomly generated numbers");
        System.out.println("n = " + N);
        System.out.println("Tries = " + TRIES);
        int[] result = experiment(N);
        for (int i = 0; i < N; i++) {
            System.out.printf("%3d:%8d%n", i, result[i]);

        }
    }
}
