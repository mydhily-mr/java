package day12;

import java.util.Scanner;

public class EH
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for A");
        final int a = sc.nextInt();
        System.out.println("Enter the value for B");
        final int b = sc.nextInt();
        try {
            System.out.println("A/B is = " + a / b);
        }
        catch (Exception e) {
            System.out.println("Exception occured, B value must be non-zero positive integer");
        }
    }
}