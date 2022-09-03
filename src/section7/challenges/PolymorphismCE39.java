package section7.challenges;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}
class Mitsubishi extends Car{
     public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        //return super.startEngine();
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }
    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        //return super.startEngine();
        return "Holden -> startEngine()";
    }
    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }
    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        //return super.startEngine();
        return getClass().getSimpleName() +" -> startEngine()";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}
public class PolymorphismCE39 {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(8, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }


}
