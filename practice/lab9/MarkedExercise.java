package practice.lab9;

/**
 * Created by tr17548 on 14/03/2018.
 */
public class MarkedExercise {

    public static int g(int n) {
        if (n <= 0)
            return 0;
        else
            return n - g(g(n - 1));
    }

    public static void main(String[] args) {
        int N = 20;
        for (int i = 0; i < N; i++)
            System.out.print(g(i) + ", ");
        System.out.println(g(N));
    }
}


