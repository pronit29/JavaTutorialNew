package loopControls.forLoop;

public class SumChallenge {

    public static void sumThreeFive(int topRangeNumber) {

        int counter = 0;
        int sum = 0;
        for(int startValue = 1; startValue <= topRangeNumber; startValue++) {
            if((startValue % 3 == 0) && (startValue % 5 == 0)) {
                System.out.println(startValue + " is divisible by both 3 and 5");
                counter++;
                sum = sum + startValue;
                if(counter == 7) {
                    break;
                }
            }
        }
        System.out.println("Number of valid values between the provided range of values = " + counter);
        System.out.println("Sum of all the valid numbers = " + sum);
    }

    public static void main(String[] args) {

        sumThreeFive(1000);


    }
}
