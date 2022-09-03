package section4;

public class Main {

    public static void main(String[] args) {

        /*long miles = section4.SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        section4.SpeedConverter.printConversion(10.5);

        section4.MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        section4.MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        section4.MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println(section4.BarkingDog.shouldWakeUp(true, 1));
        System.out.println(section4.BarkingDog.shouldWakeUp(false, 2));
        System.out.println(section4.BarkingDog.shouldWakeUp(true, 8));
        System.out.println(section4.BarkingDog.shouldWakeUp(true, -1));

        System.out.println(section4.LeapYear.isLeapYear(-1600));
        System.out.println(section4.LeapYear.isLeapYear(1600));
        System.out.println(section4.LeapYear.isLeapYear(2017));
        System.out.println(section4.LeapYear.isLeapYear(2000));*/

     /*   System.out.println(section4.DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(section4.DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, -3.176));
        System.out.println(section4.DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(section4.DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(section4.DecimalComparator.areEqualByThreeDecimalPlaces(3.174, 3.175));
        System.out.println(section4.DecimalComparator.areEqualByThreeDecimalPlaces(3.1757, 3.1756));*/

        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));

        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }
}
