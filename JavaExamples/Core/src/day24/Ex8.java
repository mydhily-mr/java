package day24;

class Ex8
{
    public static void main(final String[] args) {
        final Thread t1 = new Thread();
        final Thread t2 = new Thread();
        t1.start();
        t2.start();
        System.out.println(Thread.activeCount());
    }
}