package section8;

import java.util.Scanner;

public class ArrayList106 {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
    /*
    "C:\Program Files (x86)\Amazon Corretto\jdk11.0.15_9\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.3\lib\idea_rt.jar=61737:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.3\bin" -Dfile.encoding=UTF-8 -classpath D:\Nishant\Learnings_NewLaptop\IntelliJIDEA\JavaMasterClass\ChallengesSection4\out\production\ChallengesSection4 section8.ArrayList106

Press
	 0 - To print choice options.
	 1 - To print the list of grocery items.
	 2 - To add an item to the list.
	 3 - To modify an item in the list.
	 4 - To remove an item from the list.
	 5 - To search for an item in the list.
	 6 - To quit the application.
Enter your choice
2
Please enter the grocery item: cheese
Enter your choice
1
You have 1 items in your grocery list
1. cheese
Enter your choice
2
Please enter the grocery item: milk
Enter your choice
1
You have 2 items in your grocery list
1. cheese
2. milk
Enter your choice
2
Please enter the grocery item: bread
Enter your choice
1
You have 3 items in your grocery list
1. cheese
2. milk
3. bread
Enter your choice
0

Press
	 0 - To print choice options.
	 1 - To print the list of grocery items.
	 2 - To add an item to the list.
	 3 - To modify an item in the list.
	 4 - To remove an item from the list.
	 5 - To search for an item in the list.
	 6 - To quit the application.
Enter your choice
3
Enter item number: 2
Enter replacement item: milk
Grocery item 2 has been modified.
Enter your choice
1
You have 3 items in your grocery list
1. cheese
2. milk
3. bread
Enter your choice
5
Item to search for: coke
coke is not in the shopping list
Enter your choice
5
Item to search for: milk
Found milk in  our grocery list
Enter your choice
4
Enter item number: 2
Enter your choice
1
You have 2 items in your grocery list
1. cheese
2. bread
Enter your choice
3
Enter item number: 1
Enter replacement item: juice
Grocery item 1 has been modified.
Enter your choice
1
You have 2 items in your grocery list
1. juice
2. bread
Enter your choice
6

Process finished with exit code 0

     */
}
