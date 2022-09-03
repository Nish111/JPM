package section6;

public class ReferenceInstanceObjectClass83 {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor());// blue
        System.out.println(anotherHouse.getColor());// blue

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());//red
        System.out.println(anotherHouse.getColor());//red

        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        System.out.println(blueHouse.getColor());//red
        System.out.println(greenHouse.getColor());//green
        System.out.println(anotherHouse.getColor());//green
    }
}
class House{
    private String color;

    public House(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
