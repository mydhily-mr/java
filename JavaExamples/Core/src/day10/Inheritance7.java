package day10;

public class Inheritance7
{
    int i;
    int j;
    int a;
    int b;
    
    Inheritance7(final int a, final int b) {
        this.a = a;
        this.b = b;
        System.out.println("inisde the parent class constructor");
    }
    
    Inheritance7() {
        System.out.println("inisde default constructor");
    }
}