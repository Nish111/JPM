package section5;

public class LargestPrimaCE25 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
        System.out.println(getLargestPrime (8));
        System.out.println(getLargestPrime (62));
        System.out.println(getLargestPrime (18));
    }
    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        int maxNum=0;
        while(number % 2 == 0){
            maxNum = 2;
            number=number/2; //number>>=1;
        }
        for(int i=3; i<=Math.sqrt(number); i++){
            while(number%i == 0){
                maxNum = i;
                number= number/i;
            }
        }
        if(number>2){
            maxNum = number;
        }
        return maxNum;
    }
}
