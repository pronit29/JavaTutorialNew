package controlStatements;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            System.out.println(false);
            return false;
        } else if((year >= 1) && (year <= 9999) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if((month < 1 && month > 12) || (year < 1 && year > 9999)) {
            System.out.println(-1);
        } else {
            boolean leapYear = isLeapYear(year);
            if ((month == 2) && (leapYear == true)) {
                System.out.println(29);
            } else {
                switch (month) {
                    case 1:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(28);
                        break;
                    case 3:
                        System.out.println(31);
                        break;
                    case 4:
                        System.out.println(30);
                        break;
                    case 5:
                        System.out.println(31);
                        break;
                    case 6:
                        System.out.println(30);
                        break;
                    case 7:
                        System.out.println(31);
                        break;
                    case 8:
                        System.out.println(31);
                        break;
                    case 9:
                        System.out.println(30);
                        break;
                    case 10:
                        System.out.println(31);
                        break;
                    case 11:
                        System.out.println(30);
                        break;
                    case 12:
                        System.out.println(31);
                        break;
                    default:
                        System.out.println(-1);
                }
            }
        };
        return 1;
    }

    public static void main(String[] args) {

        //isLeapYear(2017);
        getDaysInMonth(1,2020);
    }
}
