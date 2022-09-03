package section6;

public class Classes76 {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car porsche1 ;//= new Car();
        Car holden = new Car();
        //porsche.model = "Carrera";
        //porsche = null;
        System.out.println("Modetl is " +  porsche.getModel());
        porsche.setModel("911");
        //porsche1.setModel("Carrera");// exception
        System.out.println("Modetl is " +  porsche.getModel());
    }
}
