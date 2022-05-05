package day10;

public class Inheritance7Child extends Inheritance7
{
    Inheritance7Child() {
    }
    
    Inheritance7Child(final int i, final int j) {
        super(30, 60);
        this.i = i;
        this.j = j;
    }
    
    void display() {
        System.out.println("i value is " + this.i);
        System.out.println("j value is " + this.j);
        System.out.println("a value is " + this.a);
        System.out.println("b value is " + this.b);
    }
}