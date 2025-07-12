package practice;

public class License_plate {
    private static final String[] INVALID_PLATE_LETTERS = {"FOR", "AXE", "JAM", "JAB", "ZIP", "ARE", "YOU", "JUG", "JAW", "JOY"};

    private static String generateLetters() {
        StringBuilder letters = new StringBuilder();
        int n = 'Z' - 'A' + 1;
        for (int i = 0; i < 3; i++) {
            char c = (char) ('A' + Math.random() * n);
            letters.append(c);
        }
        return letters.toString();
    }

    private static String generateDigits() {
        StringBuilder digits = new StringBuilder();
        int n = '9' - '0' + 1;
        for (int i = 0; i < 3; i++) {
            char c = (char) ('0' + Math.random() * n);
            digits.append(c);
        }
        return digits.toString();
    }

    private static boolean illegalWord(String letters) {
        for (int i = 0; i < INVALID_PLATE_LETTERS.length; i++) {
            if (letters.equals(INVALID_PLATE_LETTERS[i])) {
                return true;
            }
        }
        return false;
    }

    static String generateLicensePlate() {
        String licensePlate;
        String letters;
        do {
            letters = generateLetters();
        }
        while (illegalWord(letters));

        String digits = generateDigits();

        licensePlate = letters + "-" + digits;
        return licensePlate;
    }

    public static void main(String[] args) {
        generateLicensePlate();
    }
}