package section8.challenges;

import java.util.Scanner;
// -12321 -342 0 2234 656
public class MinimumElementCE42 {
    //static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements user wants to read");
        int number = scanner.nextInt();
        return number;
    }
    private static int[] readElements(int number){
        System.out.println("Enter the elements");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int i=0; i<number;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min=array[0];
        for(int i=0; i< array.length-1; i++){
            if(array[i+1] < min){
                min = array[i+1];
            }
        }
        return min;
    }
}
