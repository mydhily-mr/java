package day7;

public class Swapping
{
    public static void main(final String[] args) {
        final int a = 2;
        final int b = 3;
        final Test t = new Test();
        System.out.println("Before swapping: ");
        System.out.println("The value of a is:" + a);
        System.out.println("The value of b is:" + b);
        t.swap(a, b);
    }
}