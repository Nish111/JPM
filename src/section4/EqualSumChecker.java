package section4;

public class EqualSumChecker {
    public static boolean hasEqualSum(int val1, int val2, int val3){
        return ((val1 + val2 - val3) ==  0) ?true:false;
    }
}
