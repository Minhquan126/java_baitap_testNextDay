package rickkei_academy;

public class NextDayCalculator {

    public static String nextDay (int day,int month, int year) {
        String temp = "";
        if (!isDayEnd(day, month, year)){
            temp = (day + 1) + "/" + month + "/" + year;
        } else if (isFebruary(month)) {
            temp = 1 + "/" + 3 + "/" + year;
        } else if (isMonth30Day(month)) {
            temp = 1 + "/" + (month + 1) + "/" + year;
        } else if (isMonth31Day(month)) {
            if (isEndYear(month,day)){
                temp = 1 + "/" + 1 + "/" + (year + 1);
            } else {
                temp = 1 + "/" + (month + 1) + "/" + year;
            }
        }
        return temp;
    }
    private static boolean isDayEnd(int day, int month, int year){
        boolean check = false;
        if (isFebruary(month)) {
            if (isLeapYear(year)){
                if (day == 28)
                    check = true;
            } else if (day == 29) {
                check = true;
            }
        } else if (day == 30 || day == 31) {
            check = true;
        }

        return check;
    }
    private static boolean isMonth31Day(int month) {
        boolean check = false;
        int[] listMonth = {1,3,5,7,8,10,12};
        for (int i = 0; i < listMonth.length; i++)
            if (listMonth[i] == month) {
                check = true;
                break;
            }
        return check;
    }
    private static boolean isMonth30Day(int month){
        boolean check = false;
        int[] listMonth = {2,4,6,9,11};
        for (int i = 0; i < listMonth.length; i++) {
            if (month == listMonth[i]){
                check = true;
            }
        }
        return check;
    }
    private static boolean isFebruary(int month){
        boolean check = false;
        if (month == 2){
            check = true;
        }
        return check;
    }
    private static boolean isEndYear(int month, int day){
        boolean check = false;
        if (month == 12 && day == 31){
            check = true;
        }
        return check;
    }
    private static boolean isLeapYear(int year){
        boolean isLeapYear =false;
        if(year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0)
                    isLeapYear = true;
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

}
