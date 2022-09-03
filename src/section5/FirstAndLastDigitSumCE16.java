package section5;

public class FirstAndLastDigitSumCE16 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        sum+=number%10;

        int reverse=0;
        while(number>0){
            reverse+=number%10;
            number = number/10;
            reverse*=10;
            //System.out.println(reverse);
        }
        reverse/=10;
        sum+=reverse%10;
        return sum;
    }
}
