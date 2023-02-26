package methodChallenges;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {

        if((firstNumber + secondNumber) == thirdNumber) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
        }
        return false;
    }

    public static void main(String[] args) {

        hasEqualSum(1,-1,2);
    }
}
