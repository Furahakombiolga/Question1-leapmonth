public class LeapMonth {

    public static boolean isLeapMonth(int year, int month) {
        // Case For February which is the only month that can be leap
        if (month == 2) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2023;
        int month = 2;

        if (isLeapMonth(year, month)) {
            System.out.println();
            System.out.println(month + " in " + year + " is a leap month.");
        } else {
            System.out.println();
            System.out.println(month + " in " + year + " is not a leap month.");
        }
    }
}
