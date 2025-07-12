package practice.lab9;

public class Weekdays {
    private static final String[] WEEKDAYS = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static String day;

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
            System.out.print(intOfWeekday(WEEKDAYS[i]) + " ");
    }

    public static int intOfWeekday(String day) {
        Weekdays.day = day;
        switch (day = day.toLowerCase()) {

        }
        switch (intOfWeekday(day)) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                int i = -1;
                return i;
        }
        return 0;
    }


    public static String weekdayOfInt(int day) {
        if (day < 0 || day >= WEEKDAYS.length)
            return "";
        else
            return WEEKDAYS[day];
    }
}
