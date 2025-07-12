package lectures.lab1;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class lab {
    public static void calcInterest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to calculate simple or compound interest?");
        String answer = input.next();
        String simple_answer = "simple";
        String compound_answer = "compound";

        System.out.println("Enter principal amount: ");
        int principal = input.nextInt();

        System.out.println("Enter rate: ");
        int rate = input.nextInt();

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        if (answer.equals(simple_answer)) {
            int Simple_interest = (principal * rate * year);
            System.out.println("Simple interest is: " + Simple_interest);
        } else {
            if (answer.equals(compound_answer)) {
                int Compound_interest = principal * 7;
                System.out.println("Compound interest is: " + Compound_interest);
            }
        }


    }

    public static void calcMeans() {
        System.out.println("Exercise: Calculating Means");
        AtomicInteger sum = new AtomicInteger();
        int inputNum;
        int counter;
        Scanner NumScanner = new Scanner(System.in);

        System.out.println("Enter the total number of terms you want to calculate ");

        counter = NumScanner.nextInt();

        System.out.println("Please enter " + counter + " numbers: ");

        for (int x = 1; x <= counter; x++) {
            inputNum = NumScanner.nextInt();
            sum.addAndGet(inputNum);
            System.out.println();
        }
        float mean = sum.floatValue() / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }

    public static void greetName() {
        System.out.println("Exercise: Reading and Concatenating Strings");
        System.out.println("Please enter first name and family name.");
        Scanner input = new Scanner(System.in);
        String firstName = input.next().trim();
        String familyName = input.next().trim();
        System.out.println("Hello " + firstName + " " + familyName + "!");
    }

    public static void escapeSeq() {
        System.out.println("Exercise: Escape Sequences");
        String s = "\"Hello,\n World\"";
        System.out.println(s);
        s = "\t\\t|t//t/";
        System.out.println(s);
        s = "#'a\\ab\\b'^";
        System.out.println(s);
    }

    public static void nextCharacters() {
        System.out.println("Exercise: Next Characters");
        System.out.println("Please enter a letter:");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        c++;
        System.out.print(c);
        c--;
        System.out.print(c);
        System.out.println();
    }

    public static void ageDifference() {
        System.out.println("Exercise: Age Difference");
        System.out.println("Please enter age of first person in years and months ");
        Scanner input = new Scanner(System.in);
        int y1 = input.nextInt();
        int m1 = input.nextInt();
        System.out.println("Please enter age of second person in years and months ");
        int y2 = input.nextInt();
        int m2 = input.nextInt();
        int totalMonthDiff = Math.abs(y1 * 12 + m1 - y2 * 12 - m2);
        int yearDiff = totalMonthDiff / 12;
        int monthDiff = totalMonthDiff % 12;
        System.out.println("Age difference is " + yearDiff + " years and " + monthDiff + " months");
    }

    public static void main(String[] args) {
        calcInterest();
    }
}

