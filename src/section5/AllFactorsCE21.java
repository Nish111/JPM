package section5;

public class AllFactorsCE21 {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return; // return so that it should not print below 2 souts in case of invalid value
        }
        for(int i=1; i<=number/2; i++){
            if(number%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(number);
        System.out.println();
    }
}
