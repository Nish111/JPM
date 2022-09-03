package section5;

import java.util.Scanner;

public class ReadingUserInputchallenge74 {
    public static void main(String[] args) {
        // My code
        //myCode();
        hisCode();
    }

    private static void myCode() {
        Scanner scanner = new Scanner(System.in);
        int counter=0, sum=0, number;
        System.out.println("Enter 10 numbers to display sum");
        while(counter<10){
            System.out.println("Enter number #" + (counter+1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                number = scanner.nextInt();
                sum += number;
                counter++;
            }
            else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }
        scanner.close();
        System.out.println("Sum is " +sum);
    }

    public static void hisCode(){
        Scanner scanner = new Scanner(System.in);
        int counter=0, sum=0;

        while(true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10){
                    break;
                }
            }
            else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();// handle end of line(Enter key)
        }
        System.out.println("Sum is " +sum);
        scanner.close();
    }
}
