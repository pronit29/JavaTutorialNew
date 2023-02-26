package methodChallenges;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(df.format(firstNumber));
        System.out.println(df.format(secondNumber));

        if(df.format(firstNumber).equals(df.format(secondNumber))) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
        }
        return false;
    }

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
    }
}
