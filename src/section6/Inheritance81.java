package section6;

public class Inheritance81 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1,5, 5);

        Dog bond = new Dog("Bond", 8,20,
                2,4,1,20,"Long silky");
        //bond.eat();
        bond.walk();
        //bond.run();

    }
}
