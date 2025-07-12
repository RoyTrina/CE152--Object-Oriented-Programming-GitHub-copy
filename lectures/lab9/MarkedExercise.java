package lectures.lab9;

public class MarkedExercise {
    private static int g(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n - g(g(n - 1));
        }
    }


    public static void main(String[] args) {
        int N = 23;
        for (int i = 0; i < N; i++) {
            System.out.println(g(i) + ", ");
        }
        System.out.println(g(N));
    }
}