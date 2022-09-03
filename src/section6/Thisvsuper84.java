package section6;

public class Thisvsuper84 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}
class SuperClass{
    public void printMethod(){
        System.out.println("Printed in SuperClass");
    }
}
class SubClass extends SuperClass {
    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in SubClass");
    }
}
