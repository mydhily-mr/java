//consider St1,St2,StDemo

package day22;

public class StDemo
{
    public static void main(final String[] args) throws InterruptedException {
        System.out.println("main method...!");
        final St1 s1 = new St1();
        final St2 s2 = new St2();
        s1.sq_num();
        s2.double_num();
    }
}