package loopControls.whileLoop;

public class SumDigitChallenge {

    public static int sumDigits(int number) {
        int sumOfDigits = 0;
        if(number < 0){
            return -1;
        } else {
            while(number != 0) {
             sumOfDigits = sumOfDigits + number % 10;
             number = number / 10;
            }
            System.out.println("Sum of all the digits of the number = " + sumOfDigits);
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {

        sumDigits(1000);
    }
}
