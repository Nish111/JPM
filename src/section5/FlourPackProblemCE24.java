package section5;

public class FlourPackProblemCE24 {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));
        System.out.println(canPack (0,5,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        for(int i=0; i<=bigCount; i++){
            for(int j=0; j<=smallCount; j++){
                if(goal ==((i*5) + j)){
                    return true;
                }
            }
        }
        return false;
    }
}
