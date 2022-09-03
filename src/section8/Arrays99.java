package section8;

import java.util.Scanner;

public class Arrays99 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
        //arrayRelated();
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return  (double)sum/(double) array.length;
    }

    private static void arrayRelated() {
        int[] myIntArray = new int[12];

        myIntArray[1] = 10;
        myIntArray[5] = 50;
        //double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        // another way to add values
        double[] myDoubleArray = {1.2,2.3,2.3,2.4};
        //myDoubleArray = {1.2,2.3,2.3,2.4}; // but need to define in initialization
        System.out.println(myDoubleArray[1]);
        System.out.println(myDoubleArray[2]);
        System.out.println(myDoubleArray[3]);
        // 3rd way to initialize
        for(int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
