package section5;

public class NumberToWordsCE23 {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
            return;
        }
        if(number==0){
            System.out.println("Zero");
            return;
        }
        int newNumber = reverse(number);
        int digit=0;
        while(newNumber>0){
            digit = newNumber%10;
            switch (digit){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            newNumber=newNumber/10;
        }
        int diff = getDigitCount(number) - getDigitCount(reverse(number));
        if(diff >0){
            for(int i=0; i<diff; i++){
                System.out.print("Zero ");
            }
        }
        System.out.println();
    }
    public static int reverse(int num){
        int reverse=0;
        int newNum=num;
        if(num<0){
            newNum=num*(-1);
        }
        while(newNum>0){
            reverse+=newNum%10;
            newNum = newNum/10;
            reverse*=10;
        }
        reverse/=10;
        if(num<0){
            return reverse*(-1);
        }
        else {
            return reverse;
        }
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
        int count=0;
        while(number>0){
            number = number/10;
            count++;
        }
        return count;
    }
}
