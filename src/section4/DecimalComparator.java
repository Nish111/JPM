package section4;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2){
        //System.out.println(Math.abs(val1 - val2));
        //System.out.println((Math.abs(val1 - val2) < (0.0009)));
        if(val1*val2 < 0){
            return false;
        } else if((val1 - val2) == 0.000){
            //System.out.println(val1-val2);
            return true;
        } else if (Math.abs(val1 - val2) < (0.0009)) {
            //System.out.println(Math.abs(val1 - val2));
            return true;
        } else {
            return false;
        }
    }
}
