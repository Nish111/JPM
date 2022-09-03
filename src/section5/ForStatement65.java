package section5;

public class ForStatement65 {
    public static void main(String[] args) {
        System.out.println("10,000 at 2 % interest "
                + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 2 % interest "
                + calculateInterest(10000, 3.0));
        System.out.println("10,000 at 2 % interest "
                + calculateInterest(10000, 4.0));

        for(int i=2; i<9;i++){
            System.out.println("10,000 at " + i + " % interest "
                    + String.format("%.2f", calculateInterest(10000.0, (double)i)));
            // not necessary to cast
        }
        for(int i=8; i>1;i--){
            System.out.println("10,000 at " + i + " % interest "
                    + String.format("%.2f", calculateInterest(10000.0, (double)i)));
            // not necessary to cast
        }
        System.out.println(isPrime(5));
        System.out.println(isPrime(31));
        System.out.println(isPrime(107));

        int count=0;
        for(int i = 6; i<20; i++){
            if(count == 3){
                break;
            } else if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        int count1=0;
        for(int i = 6; i<20; i++){
             if(isPrime(i)){
                 count1++;
                 System.out.println("Number " + i + " is a prime number");
                 if(count1 == 3) {
                     System.out.println("Exiting for loop");
                     break;
                 }
             }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * interestRate/100);
    }
    // to find if prime or not
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<= n/2; i++){ //(long)Math.sqrt(n)
            System.out.println("Looping " +i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
