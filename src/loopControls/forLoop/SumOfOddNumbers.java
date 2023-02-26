package loopControls.forLoop;

public class SumOfOddNumbers {

    public static boolean isOdd(int number) {
        if((number <= 0) || (number % 2 == 0) ){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start <= 0) || (end <= 0) || (end < start)){
            System.out.println(-1);
            return -1;
        }else {
            for (int startNumber = start; startNumber <= end; startNumber++) {
                if ((startNumber > 0) && (end > 0) && (end >= startNumber)) {
                    isOdd(startNumber);
                    if (isOdd(startNumber)) {
                        System.out.println(startNumber + " is an odd number");
                        sum += startNumber;
                    }
                }
            }
            System.out.println("Sum of all the odd numbers in the given range = " + sum);
        }
        return sum;
    }


    public static void main(String[] args) {

        sumOdd(10,5);

    }
}
