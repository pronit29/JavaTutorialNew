package methodOverloading;

public class MinutesToYearDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days,remainingDays;
            long year;
            days = minutes / 1440;
            year = days / 365;
            if(days % 365 == 0)
            {
                remainingDays = 0;
            } else {
                remainingDays = (days % 365);
            }
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");

        }
    }

    public static void main(String[] args) {

        printYearsAndDays(1440);
    }
}
