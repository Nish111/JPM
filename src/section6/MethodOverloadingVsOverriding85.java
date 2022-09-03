package section6;

public class MethodOverloadingVsOverriding85 {
    public static void main(String[] args) {
        LocalDog ld = new LocalDog();
        GermanShepherd gs = new GermanShepherd();
        ld.bark();
        ld.bark(5);
        gs.bark();
        gs.bark(4);
        // 1 2 overloading
        // 1 3 overriding
        LocalDog bond = new LocalDog();
        bond.bark();
    }
}
class LocalDog{
    public void bark(){ // 1
        System.out.println("LocalDog Woof");
    }
    public void bark(int number){ // 2
        for(int i=0; i<number;i++){
            System.out.println("LocalDog times Woof");
        }
    }
}
class GermanShepherd extends LocalDog{
    @Override
    public void bark(){ // 3
        System.out.println("GermanShepherd Woof Woof Woof");
    }
}