package section4;

public class SecondsAndMinutesChallenge60 {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(5000));
        System.out.println(getDurationString(50, 30));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-32));
        System.out.println(getDurationString(-32, 48));
        System.out.println(getDurationString(32, 69));
    }

    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int hour = minutes/60;
            int newMinutes = minutes%60;

            String hoursString = hour + "h ";
            if(hour < 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "m ";
            if(minutes < 10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "m ";
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }
            return hoursString + minutesString + secondsString;
        }
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int minutes = seconds/60;
            int newSeconds = seconds%60;
            return getDurationString(minutes, newSeconds);

        }
    }
}
