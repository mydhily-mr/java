//consider Mt1, Mt2, MtDemo

package day22;

public class MtDemo
{
    public static void main(final String[] args) {
        System.out.println("main method...!");
        final Mt1 t1 = new Mt1();
        final Mt2 t2 = new Mt2();
        t1.start();
        t2.start();
        t1.run();
        t2.run();
    }
}