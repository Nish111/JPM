package section5;

import java.util.Scanner;

public class ReadingUserInput72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();// handle the next line character (Enter key)
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022-yearOfBirth;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of Birth");
            }
            //System.out.println("Your age is " +(2022-yearOfBirth));
            scanner.close();
        } else {
            System.out.println("Unable to parse year of birth");
        }
    }
}
