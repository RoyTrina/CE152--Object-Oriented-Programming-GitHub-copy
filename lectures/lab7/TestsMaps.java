package lectures.lab7;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class TestsMaps {
    public static void testFreqWords(String urlString) {
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openConnection().getInputStream());
            System.out.println("### freqWords");
            System.out.println("Reading input from " + url);
            for (Map.Entry<String, Integer> e : Objects.requireNonNull(Maps.freqWords()).entrySet()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testFreqWords("https://moodle.essex.ac.uk/pluginfile.php/871315/mod_resource/content/1/hounds.txt");
    }
}
