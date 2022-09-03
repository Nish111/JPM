package section8;

import java.util.Scanner;
// updated in 108, 109. 110
public class ArrayList110 {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone =
            new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

/* this should not be there- directly we can call print from mobilephone
private static void printContacts() {
        mobilePhone.printContacts();
    }*/

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }
    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
/*
Starting phone...

Available actions:
press
0  - to shutdown
1  - to print contacts
2  - to add a new contact
3  - to update existing an existing contact
4  - to remove an existing contact
5  - query if an existing contact exists
6  - to print a list of available actions.
Choose your action:

Enter action: (6 to show available actions)
1
Contact List

Enter action: (6 to show available actions)
2
Enter new contact name:
Tim
Enter phone number:
12345
New contact added: name = Tim, phone = 12345

Enter action: (6 to show available actions)
1
Contact List
1.Tim -> 12345

Enter action: (6 to show available actions)
2
Enter new contact name:
Bob
Enter phone number:
2343
New contact added: name = Bob, phone = 2343

Enter action: (6 to show available actions)
2
Enter new contact name:
Mike
Enter phone number:
334
New contact added: name = Mike, phone = 334

Enter action: (6 to show available actions)
1
Contact List
1.Tim -> 12345
2.Bob -> 2343
3.Mike -> 334

Enter action: (6 to show available actions)
6

Available actions:
press
0  - to shutdown
1  - to print contacts
2  - to add a new contact
3  - to update existing an existing contact
4  - to remove an existing contact
5  - query if an existing contact exists
6  - to print a list of available actions.
Choose your action:

Enter action: (6 to show available actions)
5
Enter existing contact name:
Tim
Name: Tim phone number is 12345

Enter action: (6 to show available actions)
5
Enter existing contact name:
Roy
Contact not found.

Enter action: (6 to show available actions)
3
Enter existing contact name:
Joy
Contact not found.

Enter action: (6 to show available actions)
3
Enter existing contact name:
Tim
Enter new contact name: Tom
Enter new contact phone number: 232342
Tim, was replaced with Tom
Successfully updated record

Enter action: (6 to show available actions)
1
Contact List
1.Tom -> 232342
2.Bob -> 2343
3.Mike -> 334

Enter action: (6 to show available actions)
4
Enter existing contact name:
Bob
Bob, was deleted.
Successfully deleted

Enter action: (6 to show available actions)
1
Contact List
1.Tom -> 232342
2.Mike -> 334

Enter action: (6 to show available actions)
6

Available actions:
press
0  - to shutdown
1  - to print contacts
2  - to add a new contact
3  - to update existing an existing contact
4  - to remove an existing contact
5  - query if an existing contact exists
6  - to print a list of available actions.
Choose your action:

Enter action: (6 to show available actions)
0

Shutting down...

Process finished with exit code 0

 */
// After bug fix for duplicate entry for updating contact name
/*
Starting phone...

Available actions:
press
0  - to shutdown
1  - to print contacts
2  - to add a new contact
3  - to update an existing contact
4  - to remove an existing contact
5  - query if an existing contact exists
6  - to print a list of available actions.
Choose your action:

Enter action: (6 to show available actions)
2
Enter new contact name:
John
Enter phone number:
1234
New contact added: name = John, phone = 1234

Enter action: (6 to show available actions)
2
Enter new contact name:
Jim
Enter phone number:
5678
New contact added: name = Jim, phone = 5678

Enter action: (6 to show available actions)
1
Contact List
1.John -> 1234
2.Jim -> 5678

Enter action: (6 to show available actions)
3
Enter existing contact name:
Jim
Enter new contact name: John
Enter new contact phone number: 1234
Contact with name John already exists. Update was not successful.
Error updating record.

Enter action: (6 to show available actions)
1
Contact List
1.John -> 1234
2.Jim -> 5678

Enter action: (6 to show available actions)
3
Enter existing contact name:
Jim
Enter new contact name: Tom
Enter new contact phone number: 123456
Jim, was replaced with Tom
Successfully updated record

Enter action: (6 to show available actions)
1
Contact List
1.John -> 1234
2.Tom -> 123456

Enter action: (6 to show available actions)

 */