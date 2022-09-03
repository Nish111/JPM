package section11.accessModifiers149;

public class PrivateClass implements section11.accessModifiers149.Accessible{
    // not possible as need to make it public
    @Override
    public void methodA() {
        System.out.println("Method A for Class " + SOME_CONSTANT);
    }

    @Override
    public void methodB() {
        System.out.println("Method B for Class " + SOME_CONSTANT);
    }

    @Override
    public boolean methodC() {
        System.out.println("Method B for Class " + SOME_CONSTANT);
        return false;
    } // private level class not possible

}
