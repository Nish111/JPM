package section11.Static150;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number "
        + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number "
                + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number "
                + StaticTest.getNumInstances());

        // java com.company._static.Main
        int answer = multiply(6); // non static methods cannot be referenced from static context
        System.out.println("the answer is " + answer);
        System.out.println("the multiplier is " + multiplier);// similar as above
    }
    public static int multiply(int number){
        return number * multiplier;
    }
}
