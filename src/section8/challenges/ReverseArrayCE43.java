package section8.challenges;

import java.util.Arrays;

public class ReverseArrayCE43 {
    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5});
    }
    private static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        System.out.println("Array = " + Arrays.toString(array));
        for(int i=0; i< array.length;i++){
            reversedArray[array.length-i-1] = array[i];
        }
        System.out.println("Reversed Array = " + Arrays.toString(reversedArray));

    }
}
