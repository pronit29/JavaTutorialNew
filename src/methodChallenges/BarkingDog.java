package methodChallenges;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking == true && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23) {
            System.out.println(true);
            return true;
        } else if (barking == true && hourOfDay >= 8 || hourOfDay <= 22) {
            System.out.println(false);
            return false;
        } else if (barking == false && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println(false);
            return false;
        } else {
            System.out.println(true);
        }
        return true;
    }


    public static void main(String[] args) {

        shouldWakeUp(true,23);
    }
}
