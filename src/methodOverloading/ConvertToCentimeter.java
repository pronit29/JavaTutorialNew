package methodOverloading;

public class ConvertToCentimeter {

    public static double convertToCentimeters(int heightInInches) {
        double heightInCentimeters;
        heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {

        int totalHeightInInch;
        totalHeightInInch = (heightInFeet * 12) + remainingHeightInInches;

        return convertToCentimeters(totalHeightInInch);
    }

    public static void main(String[] args) {

        double heightInCM = convertToCentimeters(7);
        System.out.println("Height converted to centimeter from inches " + heightInCM);
        double feetToCM = convertToCentimeters(5,8);
        System.out.println("Total height of person in centimeter from feet " + feetToCM);
    }
}
