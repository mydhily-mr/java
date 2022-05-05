package day4;

import java.util.Scanner;

public class OneDarrayDoWhileLoop
{
    public static void main(final String[] args) {
        final int[] a = new int[5];
        final Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Enter the marks:");
            a[i] = sc.nextInt();
        } while (++i <= 4);
        i = 0;
        do {
            System.out.print(String.valueOf(a[i]) + " ");
        } while (++i <= 4);
    }
}