package day15;

public class EHthrows
{
    public static void main(final String[] args) throws InterruptedException {
        method1();
    }
    
    public static void method1() throws InterruptedException {
        method2();
    }
    
    public static void method2() throws InterruptedException {
        method3();
    }
    
    public static void method3() throws InterruptedException {
        Thread.sleep(10000);
    }
}