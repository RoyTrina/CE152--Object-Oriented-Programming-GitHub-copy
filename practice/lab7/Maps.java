package practice.lab7;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Took idea from: https://stackoverflow.com/questions/18717038/adding-resources-in-intellij-for-java-project
 * Created by tr17548 on 28/02/2018.
 */
public class Maps {
    public static Map<String, Integer> freqWords(Scanner input) {
        Map<String, Integer> fab = new TreeMap<>();
        while (input.hasNext()) {
            String word = input.next();
            //  All words should be turned into lower-case before counting their frequency.
            //  All single-letter words should be ignored.
            if (word.length() > 1) {
                word.toLowerCase();
                Integer f = fab.get(word);
                int value = f == null ? 1 : f + 1;
                fab.put(word, value);
            }
        }
        input.close();
        return fab;
    }
}
