package day23;

class Example7Demo
{
    public static void main(final String[] args) {
        System.out.println("main method");
        final Example7 r1 = new Example7();
        final Ex7 r2 = new Ex7();
        final Thread t1 = new Thread(r1);
        final Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}