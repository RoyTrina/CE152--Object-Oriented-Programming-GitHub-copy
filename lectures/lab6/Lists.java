package lectures.lab6;

import java.util.Scanner;

public class Lists {
    private static int product(int[] list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of integers, with brackets: ");

        int digit0 = input.nextInt();
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();

        int ar[] = {digit0, digit1, digit2};

        int counter = 1;
        int n = ar.length;
        for (int e = 0; e < n; e++) {
            int result = counter * ar[e];
            return result;
        }
        return product(ar);
    }
}

