package section8;

import java.util.ArrayList;
    class IntClass {
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }
        public int getMyValue() {
            return myValue;
        }
        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }
public class AutoBoxingUnboxing112 {
        public static void main(String[] args) {
            String[] strArray = new String[10];
            int[] intArray = new int[10];
            ArrayList<String> strArrayList = new ArrayList<String>();
            strArrayList.add("Tim");
//          ArrayList<int> intArrayList = new ArrayList<int>(); // not primitive type so error
            ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
            intClassArrayList.add(new IntClass(54));
            Integer integer = new Integer(54);
            Double doubleValue = new Double(12.25);

            ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // using autoboxing
        }
        for(int i=0; i<=10; i++) {
            // this is unboxing
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
            Integer myIntValue = 56; // Integer.valueOf(56) when compiled   ;
            int myInt = myIntValue.intValue(); // myIntValue.intValue();
            ArrayList<Double> myDoubleValues = new ArrayList<Double>();
            for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
                myDoubleValues.add(dbl);
            }
            for(int i=0; i<myDoubleValues.size(); i++) {
                double value = myDoubleValues.get(i);
                System.out.println(i + "  --> " + value);
            }
        }
    }

