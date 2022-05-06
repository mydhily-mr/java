package day26;

public class D2Demo
{
    public static void main(final String[] args) {
        final D2 t = new D2();
        t.setDaemon(true);
        t.start();
        System.out.println("Main Thread");
    }
}