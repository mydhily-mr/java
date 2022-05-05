package day4;

import java.util.Scanner;

public class OneDarrayForloop
{
    public static void main(final String[] args) {
        final int[] a = new int[5];
        final Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; ++i) {
            System.out.println("Enter the marks:");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= 4; ++i) {
            System.out.print(String.valueOf(a[i]) + " ");
        }
    }
}