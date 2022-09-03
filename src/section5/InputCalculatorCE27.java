package section5;
import java.util.Scanner;

public class InputCalculatorCE27 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum=0, count=0;
        long avg=0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                sum+=number;
                count++;
            }
            else{
                if(count == 0){
                    avg=sum;
                }
                else {
                    //System.out.println(sum);
                    //System.out.println(count);
                    avg = Math.round((double)sum/count);
                    //System.out.println(avg);
                }
                System.out.println("SUM = "+ sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
