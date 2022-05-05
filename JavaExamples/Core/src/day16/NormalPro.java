package day16;

public class NormalPro
{
    int a;
    int b;
    
    void add() {
        this.a = 10;
        this.b = 20;
        final int c = this.a + this.b;
        System.out.println(c);
    }
    
    void sub() {
        this.a = 20;
        this.b = 10;
        final int c = this.a - this.b;
        System.out.println(c);
    }
}