package day23;

class MyThreadDemo
{
    public static void main(final String[] args) {
        final MyThread t1 = new MyThread();
        t1.start();
        System.out.println("main method");
    }
}