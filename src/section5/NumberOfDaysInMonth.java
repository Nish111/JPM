package section5;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
    public static boolean isLeapYear(int year){
        boolean value = false;
        if(year >= 1 && year<=9999){
            if(year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        value=true;
                    }
                } else {
                    value = true;
                }
            }
        }
        return value;
    }
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        if(month == 2){
            if(isLeapYear(year)){
                return 29;
            }
            else {
                return 28;
            }
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        else {
            return 30;
        }
    }
}
