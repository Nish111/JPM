package videos;

public class MethodOVerloading58 {
    public static void main(String[] args) {
        //calculateScore("Loid", 500);
/*        int newScore = calculateScore("Loid", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();*/
        System.out.println(calcFeetAndInchesToCentimeters(5, 1));
        System.out.println(calcFeetAndInchesToCentimeters(6, 7));
        System.out.println(calcFeetAndInchesToCentimeters(3, 13));
        System.out.println(calcFeetAndInchesToCentimeters(45));
        System.out.println(calcFeetAndInchesToCentimeters(-1));

        System.out.println(calcFeetAndInchesToCentimetersHisCode(6, 0));
        System.out.println(calcFeetAndInchesToCentimetersHisCode(7, 5));
        System.out.println(calcFeetAndInchesToCentimetersHisCode(-10, 5));
        System.out.println(calcFeetAndInchesToCentimetersHisCode(0, -10));
        System.out.println(calcFeetAndInchesToCentimetersHisCode(6, 13));

        System.out.println(calcFeetAndInchesToCentimetersHisCode(100));
        System.out.println(calcFeetAndInchesToCentimetersHisCode(158));
        System.out.println(calcFeetAndInchesToCentimetersHisCode(-12));



    }
    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored "+ score + " points");
        return score * 100;
    }
    private static int calculateScore(int score) {
        System.out.println("Unnamed Player scored "+ score + " points");
        return score * 100;
    }
    private static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
/*    private static void calculateScore() {
        System.out.println("No player name, no player score");
    }*/

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters;
        if(feet >= 0 && (inches >= 0 || inches <= 12)){
            centimeters = (feet * 30.48) + (inches * 2.54);
            return centimeters;
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(int inches){
        double feet, newInches;
        if(inches >= 0){
            feet = (inches / 12);
            newInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, newInches);
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimetersHisCode(double feet, double inches){
        if((feet < 0) || (inches < 0 || inches > 12)){
            System.out.println("Invalid");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimetersHisCode(int inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimetersHisCode(feet, remainingInches);
        }
}
