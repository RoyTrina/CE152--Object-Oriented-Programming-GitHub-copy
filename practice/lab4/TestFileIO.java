package practice.lab4;

import java.io.FileNotFoundException;

/**
 * Created by tr17548 on 07/02/2018.
 */
public class TestFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        final String WORDS = "data/words.txt";
        testNumberOfWords();
        testNumberOfLines();
    }

    private static void testNumberOfWords() throws FileNotFoundException {
        System.out.println("File: " + " data/words.txt");
        System.out.printf("Number of words = %d", FileIO.numberOfWords("data/words.txt"));
    }

    private static void testNumberOfLines() throws FileNotFoundException {
        System.out.println("File: " + "data/words.txt");
        System.out.println("Number of lines = " + FileIO.numberOfLines("data/words.txt"));
    }
}

