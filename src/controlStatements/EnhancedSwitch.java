package controlStatements;

public class EnhancedSwitch {

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH", "APRIL" -> "1st";
            case "MAY", "JUNE", "JULY", "AUGUST" -> "2nd";
            case "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" -> "3rd";
            default -> {
                String badresponse = month + " is bad";
                yield badresponse;

            }
        };
    }

    public static void main(String[] args) {

        System.out.println(getQuarter("NSBDJSAD"));

    }
}
