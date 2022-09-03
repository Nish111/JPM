package section4;

public class TeenNumberChecker {
    public static boolean hasTeen(int val1, int val2, int val3){
        if((val1 >= 13 && val1 <= 19) || (val2 >= 13 && val2 <= 19) || (val3 >= 13 && val3 <= 19)){
            return true;
        }
        else
            return false;
    }
    public static boolean isTeen(int val1){
        if((val1 >= 13 && val1 <= 19)){
            return true;
        }
        else
            return false;
    }
}
