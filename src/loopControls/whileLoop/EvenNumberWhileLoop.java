package loopControls.whileLoop;

public class EvenNumberWhileLoop {

    public static boolean isEven(int number) {
        if((number % 2 == 0)) {
            return true;
        }
        return false;
    }

    public static void printEvenNumbers(int startValue, int endValue) {

        int counter = 0;
        int oddCounter = 0;
        while(startValue <= endValue) {
            if(isEven(startValue)) {
                counter++;
                System.out.println(startValue + " is an even number in the given range of values");
                if(counter == 5) {
                    break;
                }
            } else if(!isEven(startValue)) {
                oddCounter++;
                System.out.println("<----------------------------------------->");
                System.out.println(startValue + " is an odd number in the given range of values");
            }
            startValue++;
        }
        System.out.println("Total number of even numbers in the given range of numbers = " + counter);
        System.out.println("Total number of odd numbers in the given range of numbers = " + oddCounter);

    }

    public static void main(String[] args) {

        printEvenNumbers(5,20);
    }
}
