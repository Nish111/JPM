package section8.challenges;

import java.util.Scanner;

public class SortedArrayCE41 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }
        int [] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                int temp = 0;
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }
}
