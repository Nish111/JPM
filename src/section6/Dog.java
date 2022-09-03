package section6;
/**
 *  dog
 *
 */ // Inheritance 81
public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        //move(5); // better to use method than super
        super.move(5);
    }

  /*  @Override
    public void move(int speed) { //2
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed); //4 - calling move from Animal
        // this sequence is what happened
    }*/

    private void moveLegs(int speed) { //3
        System.out.println("Dog.moveLegs() called");
    }

    public void run(){ // 1
        System.out.println("Dog.run() called");
        move(10);
    }
}
