package lectures.lab4;

import java.io.FileNotFoundException;

public class TestFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        final String FILE_NAME = "data/words.txt";
        testNumberOfWords(FILE_NAME);
        testNumberOfLines(FILE_NAME);
        testNumberOfLines("data/xxx.yyy");
    }

    public static void testNumberOfWords(String fileName) throws FileNotFoundException {
        System.out.println("File: " + fileName);
        System.out.println("Number of words = " + FileIO.numberOfWords());
    }

    public static void testNumberOfLines(String fileName) throws FileNotFoundException {
        System.out.println("Line: " + fileName);
        System.out.println("Number of lines = " + FileIO.numberOfLines(fileName));

    }

}
