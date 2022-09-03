package section5;
import java.util.Scanner;

public class MinAndMaxInputChallenge75 {
    public static void main(String[] args) {
        //myCode();
        hisCode();
    }

    private static void hisCode() {
        Scanner scanner = new Scanner(System.in);
        int minimum=0, maximum=0;
        boolean first= true; // solution 1
        // solution 2 is manually setting values of max and min Integer for min and max
        // solution 3 is one used by me
        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                // solution 1 starts
                if(first){
                    first = false;
                    minimum = number;
                    maximum = number;
                }
                // solution 1 ends
                if(number<minimum){
                    minimum = number;
                }
                if(number>maximum){
                    maximum = number;
                }
            }
            else{
                break;
            }
            scanner.nextLine();// handle input
        }
        System.out.println("Minimum number is " + minimum);
        System.out.println("Maximum number is " + maximum);
        scanner.close();
    }

    private static void myCode() {
        Scanner scanner = new Scanner(System.in);
        int minimum=Integer.MAX_VALUE, maximum=Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(number<minimum){
                    minimum = number;
                }
                if(number>maximum){
                    maximum = number;
                }
            }
            else{
                System.out.println("Minimum number is " + minimum);
                System.out.println("Maximum number is " + maximum);
                break;
            }
        }
    }
}
