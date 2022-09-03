package section8;

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
// List and ArrayList 105
public class GroceryList {
    private int[] myNumbers = new int[50];
    //myNumbers[5] = 50; need to add this only in method cannot be done anywhere else
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item) {
        groceryList.add(item);
        myNumbers[5] = 50;
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    // 106
    public String findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem); // to find using contains
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}

