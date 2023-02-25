package methodChallenges;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        long convertedSpeed;
        if(kilometersPerHour < 0)
        {
            System.out.println(-1);
            return -1;
        } else {
            convertedSpeed = Math.round(kilometersPerHour / 1.609);
            System.out.println(convertedSpeed);
        }
        return convertedSpeed;
    }

    public static void printConversion(double kilometersPerHour) {
        long convertedSpeed;
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        } else {
            convertedSpeed = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h" + " = " + convertedSpeed + " mi/h");
        }

    }

    public static void main(String[] args) {

        toMilesPerHour(-5.6);
        printConversion(10.25);
    }
}
