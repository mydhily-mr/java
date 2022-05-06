package day23;

class Example5Demo
{
    public static void main(final String[] args) {
        System.out.println("main method starts..!");
        System.out.println(Thread.currentThread().getName());
        final Example5 t1 = new Example5();
        t1.start();
        System.out.println(t1.getName());
        Thread.currentThread().setName("sagar");
        System.out.println(Thread.currentThread().getName());
        t1.setName("sandesh");
        System.out.println(t1.getName());
        System.out.println(10 / 0);
    }
}