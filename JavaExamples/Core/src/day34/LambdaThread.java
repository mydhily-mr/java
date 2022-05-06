package day34;

public class LambdaThread
{
    public static void main(final String[] args) {
        final Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running....");
            }
        };
        final Thread t1 = new Thread(r1);
        t1.start();
        final Runnable r2 = () -> System.out.println("Thread2 is running....");
        final Thread t2 = new Thread(r2);
        t2.start();
    }
}