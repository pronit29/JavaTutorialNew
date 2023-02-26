package loopControls.forLoop;

public class PrimeNumber {

    public static boolean isPrime(int wholeNumber) {
        for(int divisor = 2; divisor < wholeNumber; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNumber(int endValue) {
        int primeCounter = 0;
        for(int startValue = 2; startValue <= endValue; startValue++) {
            if(isPrime(startValue)){
                primeCounter++;
                System.out.println(startValue + " is a prime number");
//                if(primeCounter == 3) {
//                    break;
//                }
            }
            }
        System.out.println("Total number of prime numbers = " + primeCounter);
        }

    public static void main(String[] args) {

        primeNumber(50);
    }
}
