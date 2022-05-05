package day15;

import java.util.Scanner;

public class Throwkeyword1
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        final int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        final int b = sc.nextInt();
        System.out.println(divide(a, b));
    }
    
    public static int divide(final int a, final int b) {
        if (b < 0) {
            throw new ArithmeticException("/ by zero");
        }
        if (b > a) {
            throw new ArithmeticException("b>a");
        }
        return a / b;
    }
}