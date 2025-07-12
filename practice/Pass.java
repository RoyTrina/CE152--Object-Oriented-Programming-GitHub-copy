package practice;

import java.util.Random;

public class Pass {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(geek_Password(length));
    }

    private static char[] geek_Password(int len) {
        System.out.println("Generating password using random(): ");
        System.out.println("Your new password is: ");

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>()\"";
        String values = Capital_chars + Small_chars + numbers + symbols;

        Random rand_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(rand_method.nextInt(values.length()));
        }
        return password;
    }


}
/*https://www.geeksforgeeks.org/generating-password-otp-java/*/
