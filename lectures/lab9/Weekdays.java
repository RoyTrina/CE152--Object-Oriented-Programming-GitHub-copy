package lectures.lab9;

public class Weekdays {

    public static final String[] WEEKDAYS = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday"};

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
            System.out.print(intOfWeekday(WEEKDAYS[i]) + " ");
    }

    static int intOfWeekday(String day) {
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
                return -1;
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
