package section6;

public class CovariantReturnType85 {
    public static void main(String[] args) {

    }
}
class Burger{

}
class HealthyBurger extends Burger{

}
class BurgerFactory{
    public Burger createBurger(){
        //return new Burger(); // this can return Burger or HealthyBurger
        return new HealthyBurger();
    }
}
class HealthyBurgerFactory extends BurgerFactory{
    @Override
    public HealthyBurger createBurger(){
        return new HealthyBurger(); // only HealthyBurger

    }
}