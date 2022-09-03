package section5;

public class DigitSumChallenge70 {
    public static void main(String[] args) {
        System.out.println("Sum of digits in number 3 is " + sumDigits(3));
        System.out.println("Sum of digits in number 35 is " + sumDigits(35));
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in number 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum=0;
        while(number>0){
            sum+=number%10;
            number=number/10;
        }
        return sum;
    }
}
