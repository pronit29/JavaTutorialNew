package methodChallenges;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mbCalculation;
        int remainingKB;
        if(kiloBytes < 0 ) {
            System.out.println("Invalid Value");
        } else {

            mbCalculation = kiloBytes / 1024;
            remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB" + " = " + mbCalculation + " MB and " + remainingKB + " KB");
        }
    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);
    }
}
