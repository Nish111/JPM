package section7.part92;

public class Room {
    private int doors;
    private int windows;
    private Furniture furniture;

    public int getDoors() {
        return doors;
    }
    public int getWindows() {
        return windows;
    }
    public Furniture getFurniture() {
        return furniture;
    }
    public void showRoom(String name){
        System.out.println("You have entered the room " + name);
    }
    public Room(int doors, int windows, Furniture furniture) {
        this.doors = doors;
        this.windows = windows;
        this.furniture = furniture;
    }
}
