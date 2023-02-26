package controlStatements;

public class PrintDayUsingEnhancedSwitch {

    public static String printDayOfWeek(int day) {

        return switch(day) {
            case 0 -> { yield "Sunday";}
            case 1 -> { yield "Monday";}
            case 2 -> { yield "Tuesday";}
            case 3 -> { yield "Wednesday";}
            case 4 -> { yield "Thursday";}
            case 5 -> { yield "Friday";}
            case 6 -> { yield "Saturday";}
            default -> { yield "Invalid Day";}
        };
    }

    public static String printDayOfWeekWithIf(int day) {
        if(day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        }else if (day == 2) {
            return "Tuesday";
        }else if (day == 3) {
            return "Wednesday";
        }else if (day == 4) {
            return "Thursday";
        }else if (day == 5) {
            return "Friday";
        }else if (day == 6) {
            return "Saturday";
        }else {
        }
        return "Invalid Day";
    }

    public static void main(String[] args) {

        System.out.println("It is " + printDayOfWeek(3));
        System.out.println("It is " + printDayOfWeekWithIf(8));

    }
}
