package day4;

import java.util.Scanner;

public class OneDarray
{
    public static void main(final String[] args) {
        final int[] a = new int[5];
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        a[0] = sc.nextInt();
        System.out.println("Enter the marks:");
        a[1] = sc.nextInt();
        System.out.println("Enter the marks:");
        a[2] = sc.nextInt();
        System.out.println("Enter the marks:");
        a[3] = sc.nextInt();
        System.out.println("Enter the marks:");
        a[4] = sc.nextInt();
        System.out.print(String.valueOf(a[0]) + " ");
        System.out.print(String.valueOf(a[1]) + " ");
        System.out.print(String.valueOf(a[2]) + " ");
        System.out.print(String.valueOf(a[3]) + " ");
        System.out.print(String.valueOf(a[4]) + " ");
    }
}