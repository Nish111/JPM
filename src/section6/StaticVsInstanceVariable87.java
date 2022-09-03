package section6;

public class StaticVsInstanceVariable87 {
    public static void main(String[] args) {
        AnotherDog rex = new AnotherDog("rex");
        AnotherDog fluffy = new AnotherDog("fluffy");
        rex.printName();
        fluffy.printName();
    }
}
class AnotherDog{
    private static String name;
    private String nameAgain;

    public AnotherDog(String name){
        AnotherDog.name = name;
        this.nameAgain = name;
    }
    public void printName(){
        System.out.println("name = " + name);
        System.out.println("nameAgain = " + nameAgain);
    }
}
