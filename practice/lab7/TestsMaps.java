package practice.lab7;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tr17548 on 28/02/2018.
 */
public class TestsMaps {
    public static void testFreqWords(String urlString) {
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openConnection().getInputStream());
            System.out.println("### freqWords");
            System.out.println("Reading input from " + url);
            for (Map.Entry<String, Integer> e : Maps.freqWords(input).entrySet()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testFreqWords("https://orb.essex.ac.uk/ce/ce152/data/hounds.txt");

    }
}

