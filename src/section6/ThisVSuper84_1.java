package section6;

public class ThisVSuper84_1 {
    public static void main(String[] args) {

    }
}
class Shape{
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangle extends Shape{
    //private int x;
    //private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this(x,y, 0, 0);

    }
    public Rectangle(int x, int y, int width, int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
    // commented is bad way of initializing
    /*public Rectangle(){
        this(0,0);
        *//*this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;*//*
    }*/
    /*public Rectangle(int width, int height){
        this(0,0, width, height);
       *//* this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;*//*
    }*/


//    public Rectangle(int x, int y, int width, int height) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }
}
