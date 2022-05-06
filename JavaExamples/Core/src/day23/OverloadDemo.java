package day23;

class OverloadDemo
{
    public static void main(final String[] args) {
        final Overload t1 = new Overload();
        t1.start();
        t1.run(5);
        System.out.println("main method");
    }
}