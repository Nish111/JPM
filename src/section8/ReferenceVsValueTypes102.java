package section8;

import java.util.Arrays;

public class ReferenceVsValueTypes102 {
    public static void main(String[] args) {
        // Value types - both different values
        int myValue = 10;
        int anotherValue = myValue;
        System.out.println("myIntValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;
        System.out.println("myIntValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue);

        // reference types
        /*
        So again, a reference holds a reference or an address to the object,  but not
        the object itself.  So in other words the variable here my int array  holds a
        reference or address to an array in memory.  With reference types, we're using a
        reference to control the object in memory.  So we can't access the object directly.
         */
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){
        array[0] = 2;
        //we're de-referencing the reference by doing below
        array = new int[]{1,2,3,4,5};
    }
}
