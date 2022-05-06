package day26;

public class D1Demo
{
    public static void main(final String[] args) {
        final D1 t1 = new D1();
        t1.start();
        System.out.println(Thread.currentThread().isDaemon());
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
    }
}