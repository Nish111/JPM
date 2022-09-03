package section5;

public class NumberPalindromeCE15 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11221));
    }
    public static boolean isPalindrome(int number){
        int reverse=0;
        int newNumber = Math.abs(number);
        while(newNumber>0){
            reverse+=newNumber%10;
            newNumber = newNumber/10;
            reverse*=10;
            //System.out.println(reverse);
        }
        reverse/=10;
        //System.out.println(reverse);
        if(Math.abs(number)==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}
