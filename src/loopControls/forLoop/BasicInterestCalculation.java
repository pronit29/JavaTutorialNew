package loopControls.forLoop;

public class BasicInterestCalculation {

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void main(String[] args) {

        for(double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0,rate);
            System.out.println("10,000 at rate " + rate + "% interest: " + interestAmount);
        }

        System.out.println("<----------------------------------------------------------------------->");

        for(double rate1 = 7.5; rate1 <= 10; rate1 += 0.25) {
            double interestAmt = calculateInterest(100.0,rate1);
            if(interestAmt > 8.5) {
                break;
            }
            System.out.println("$100 at rate " + rate1 + "% interest = $" + interestAmt);

        }
    }
}
