package methodOverloading;

public class TimeConversion {

    public static String getDurationString(int timeInSeconds) {

        int minutes = timeInSeconds / 60;
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = timeInSeconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int timeInMinutes, int timeInSeconds) {

        String timeInHours = String.valueOf(timeInSeconds / 3600);
        return timeInHours;
    }


    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
    }
}
