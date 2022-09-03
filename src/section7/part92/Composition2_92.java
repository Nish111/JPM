package section7.part92;

public class Composition2_92 {
    public static void main(String[] args) {
        Room room = new Room(2,3,new Furniture("Best", 203));
        House house = new House(room);
        room.showRoom("Hall");

        // hiding methods

    }
}
