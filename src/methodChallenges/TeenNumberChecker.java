package methodChallenges;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        if((firstNumber >= 13) && (firstNumber <= 19) || (secondNumber >= 13) && (secondNumber <= 19) || (thirdNumber >= 13) && (thirdNumber <= 19)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
        }
        return false;
    }

    public static boolean isTeen(int firstNumber) {
        if((firstNumber >= 13) && (firstNumber <= 19)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
        }
        return false;
    }
    public static void main(String[] args) {

        hasTeen(22,34,15);
        isTeen(13);
    }
}
