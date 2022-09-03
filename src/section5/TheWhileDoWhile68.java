package section5;

public class TheWhileDoWhile68 {
    // Challenge in 68
    public static boolean evenNumber(int number){
        //System.out.println("Check for even number");
        if(number%2==0){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(evenNumber(5));
        System.out.println(evenNumber(6));

        int count=1;
        System.out.println("While loop");
        while(count != 6){
            System.out.println("Count value is "+count);
            count++;
        }
       /*  int count1=0;
        for(int i=1; i<7; i++){
            System.out.println("Count value is "+count1);
            count1++;
        }*/
        // this for loop is identical to while
        System.out.println("For loop identical to while");
        for(count=1; count!=6; count++){
            System.out.println("Count value is "+count);
        }
        System.out.println("Similar While loop");
        count=1;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("Count value is "+count);
            count++;
        }
        System.out.println("never executed ");
        count=6;
        while(count != 6){
            System.out.println("Count value is "+count);
            count++;
        }
        System.out.println("Do While");
        count=1;
        do{
            System.out.println("Count value is "+count);
            count++;
        } while(count!=6);
/*        System.out.println("Infinite Do While");
        count=6;
        do{
            System.out.println("Count value is "+count);
            count++;
        } while(count!=6);*/
        System.out.println("Do While with break");
        count=6;
        do{
            System.out.println("Count value is "+count);
            count++;
            if(count>10){
                break;
            }
        } while(count!=6);

        System.out.println("After challenge");
        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!evenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Using do while for same");
        number = 4;
        do{
            number++;
            if(!evenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }while(number <= finishNumber);

        System.out.println("New challenge");
        number = 4;
        count=0;
        while(number <= finishNumber){
            number++;
            if(!evenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if(count==5){
                break;
            }

        }
        System.out.println("Total even numbers found "+ count);
    }
}
