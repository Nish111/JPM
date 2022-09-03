package section7.par97;

public class MasterChallenge97 {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage",
                3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.25);
        hamburger.addHamburgerAddition3("Paneer", 0.35);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println("------------");
        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("Onion", 1.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.23);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("------------");
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 12.34);
        db.itemizeHamburger();
    }
}
