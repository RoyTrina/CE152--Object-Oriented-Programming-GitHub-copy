package lectures.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tr17548 on 07/02/2018.
 * Got the code from: https://stackoverflow.com/questions/20196211/read-input-from-text-file-in-java
 */
public class FileIO {
    static int numberOfWords() throws FileNotFoundException {
        int n;
        try (Scanner Words = new Scanner(new File("data/Words.txt"))) {
            Words.useDelimiter(" ");
            n = 0;
            while (Words.hasNext()) {
                n = n + 1;
            }
        }
        return n;
    }

    static int numberOfLines(String fileName) throws FileNotFoundException {
        try {
            Scanner Lines = new Scanner(new File("data/words.txt"));
            int line = 0;
            while (Lines.hasNextLine()) {
                String l = Lines.nextLine();
                line = line + 1;
            }
            Lines.close();
            return line;
        } catch (FileNotFoundException j) {
            return -1;
        }

    }
}