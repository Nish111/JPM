package section9.part125;

import java.util.ArrayList;
import java.util.Scanner;

public class Main125 {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);
// till here o/p saved

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        //werewolf.getStrength(); // not working because this is not in ISaveable
        System.out.println("Strength of monster "+((Monster) werewolf).getStrength());
        // cast werewolf to monster
        saveObject(werewolf);

        Monster vampire = new Monster("Vampire", 20, 40);
        System.out.println(vampire);
        vampire.getStrength(); // working because this is Monster reference
        System.out.println("Strength of monster "+((Monster) vampire).getStrength());
        // cast not needed
        saveObject(vampire);

    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) +
                    " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }
}
/*
Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
Saving Tim to storage device
Saving 10 to storage device
Saving 15 to storage device
Saving Sword to storage device
Player{name='Tim', hitPoints=8, strength=15, weapon='Sword'}
Saving Tim to storage device
Saving 8 to storage device
Saving 15 to storage device
Saving Stormbringer to storage device
Choose
1 to enter a string
0 to quit
Choose an option: 1
Enter a string: Loid
Choose an option: 1
Enter a string: 25
Choose an option: 1
Enter a string: 11
Choose an option: 1
Enter a string: Gun
Choose an option: 0
Player{name='Loid', hitPoints=25, strength=11, weapon='Gun'}
 */