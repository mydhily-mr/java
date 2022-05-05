package day12;

public class EHDemo
{
    public static void wakeup() {
        sleep();
        System.out.println("in wake up method");
    }
    
    public static void sleep() {
        System.out.println("in sleep method");
    }
    
    public static void main(final String[] args) {
        System.out.println("in main method");
        wakeup();
    }
}