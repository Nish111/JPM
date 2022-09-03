package section5;

public class Sum3And5_67 {
    public static void main(String[] args) {
        int count=0, sum=0;
        for(int i=1; i<=1000; i++){
            if(count==5){
                System.out.println(sum);
                break;
            } else {
                if(i%3==0 && i%5==0){
                    sum+=i;
                    count++;
                    System.out.println(i);
                }
            }
        }
    }
}
