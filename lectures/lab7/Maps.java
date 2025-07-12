package lectures.lab7;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps {
    public static TreeMap<String, Integer> freqWords() {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> frequency_map = new TreeMap<>();
        while (input.hasNext()) {
            String word = input.next();
            //  All words should be turned into lower-case before counting their frequency.
            //  All single-letter words should be ignored.
            if (word.length() > 1) {
                word.toLowerCase();
                Integer f = frequency_map.get(word);
                int value = f == null ? 1 : f + 1;
                frequency_map.put(word, value);
            }
        }
        input.close();
        return null;
    }
}