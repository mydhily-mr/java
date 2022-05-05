package day6;

public class StaticDemo
{
    static int sv;
    int iv;
    
    static {
        StaticDemo.sv = 25;
    }
    
    public StaticDemo() {
        this.iv = 50;
    }
    
    public static void main(final String[] args) {
        final StaticDemo d1 = new StaticDemo();
        System.out.println(StaticDemo.sv);
        System.out.println(d1.iv);
        StaticDemo.sv = 143;
        d1.iv = 420;
        System.out.println(StaticDemo.sv);
        System.out.println(d1.iv);
        final StaticDemo d2 = new StaticDemo();
        d2.iv = 500;
        System.out.println(StaticDemo.sv);
        System.out.println(d2.iv);
        final StaticDemo d3 = new StaticDemo();
        System.out.println(StaticDemo.sv);
        System.out.println(d3.iv);
    }
}