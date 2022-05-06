package day23;

class Example8Demo
{
    public static void main(final String[] args) {
        System.out.println("main method");
        final Example8 day23 = new Example8();
        final Thread t1 = new Thread(day23);
        day23.start();
    }
}
