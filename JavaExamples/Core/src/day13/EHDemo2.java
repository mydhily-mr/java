package day13;

import java.util.Scanner;

public class EHDemo2
{
    public static void main(final String[] args) {
        try {
            final Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value A");
            final int a = sc.nextInt();
            System.out.println("Enter the value B");
            final int b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (Exception e) {
            System.out.println("Execption is handled");
            System.out.println(e.getMessage());
            return;
        }
        finally {
            System.out.println("finally block is executed...!");
        }
        System.out.println("finally block is executed...!");
    }
}