package practice.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tr17548 on 07/02/2018.
 * Got the code from: https://stackoverflow.com/questions/20196211/read-input-from-text-file-in-java
 */
public class FileIO {
    public static int numberOfWords(String FileName) throws FileNotFoundException {
        Scanner Words = new Scanner(new File("data/Words.txt"));
        //Words.useDelimiter(" ");
        int n = 0;
        while (Words.hasNext()) {
            String s = Words.next();
            n = n + 1;
        }
        Words.close();
        return n;
    }

    public static int numberOfLines(String fileName) throws FileNotFoundException {
        Scanner Lines = new Scanner(new File("data/words.txt"));
        int line = 0;
        while (Lines.hasNextLine()) {
            String l = Lines.nextLine();
            line = line + 1;
        }
        Lines.close();
        return line;
    }
}
