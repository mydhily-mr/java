package day23;

class Example6Demo
{
    public static void main(final String[] args) {
        final Example6 t1 = new Example6();
        t1.start();
        System.out.println("main method  is executed by: " + Thread.currentThread().getName());
    }
}