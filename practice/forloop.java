package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class forloop {
    public static List<Integer> xs(List<Integer> list) {
        List<Integer> xs = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 6; i++) {
            xs.add(rnd.nextInt(6));
        }
        double sum = 0;

        for (Integer d : xs) {
            sum += d;
            System.out.println("sum" + xs + " = " + sum);
        }
        return xs;
    }
}