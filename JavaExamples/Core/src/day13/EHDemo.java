package day13;

public class EHDemo
{
    public static void wakeup() {
        System.out.println(10 / 0);
        sleep();
        System.out.println("in wake up method");
    }
    
    public static void sleep() {
        System.out.println("in sleep method");
    }
    
    public static void main(final String[] args) {
        try {
            System.out.println("in main method");
        }
        catch (Exception s) {
            System.out.println("Exception handled...!");
        }
        wakeup();
    }
}
