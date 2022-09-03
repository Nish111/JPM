package section5;

public class SharedDigitCE18 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int a, int b){
        if(!((a>=10 && a<=99) && (b>=10 && b<=99))){
            return false;
        }
        int digit1=0;
        int digit2=0;
        int digit3=0;
        int digit4=0;
        digit1=a%10;
        digit2=(a-digit1)/10;
        digit3=b%10;
        digit4=(b-digit3)/10;
        if((digit1 == digit3) || (digit1 == digit4)){
            return true;
        }
        if((digit2 == digit3) || (digit2 == digit4)){
            return true;
        }
        return false;
    }
}
