package day23;

class Example9Demo
{
    public static void main(final String[] args) {
        System.out.println("main method");
        final Example9 day23 = new Example9();
        final Thread t1 = new Thread();
        final Thread t2 = new Thread(day23);
        t1.start();
        t2.start();
        t1.run();
        t2.run();
        day23.run();
    }
}