package section5;

public class LastDigitChecker19 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!((a>=10 && a<=1000) && (b>=10 && b<=1000) && (c>=10 && c<=1000))){
            return false;
        }
        if(a%10 == b%10){
            return true;
        }
        if(a%10 == c%10){
            return true;
        }
        return c % 10 == b % 10;
    }
    public static boolean isValid(int number){
        if((number>=10 && number<=1000)){
            return true;
        }
        else{
            return false;
        }
    }
}
