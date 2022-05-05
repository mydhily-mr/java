package day10;

public class Statics
{
    int x;
    static int y;
    
    static {
        Statics.y = 20;
        System.out.println("inside the static block");
        System.out.println(Statics.y);
    }
    
    Statics() {
        this.x = 10;
        System.out.println("inside the instance block");
        System.out.println(this.x);
        System.out.println("inside the constructor");
    }
}