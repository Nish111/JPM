package section5;

public class GreatestCommonDivisionCE20 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int temp;
        if(first>second){
            temp=second;
            second=first;
            first=temp;
        }
        //if(second%first )
        while(first>0){
                temp=second%first;
                second=first;
                first=temp;
        }
        return second;
    }
}
