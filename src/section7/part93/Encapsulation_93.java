package section7.part93;

public class Encapsulation_93 {
    public static void main(String[] args) {
        /* Incorrect way not using Encapsulation
        Player player = new Player();
        player.name = "Bachira";
        //player.health=20;
        player.weapon="Dribble";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Zoro", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        EnhancedPlayer player1 = new EnhancedPlayer("Mihawk", 200, "Sword");
        System.out.println("Initial health is " + player1.getHealth());

    }
}
