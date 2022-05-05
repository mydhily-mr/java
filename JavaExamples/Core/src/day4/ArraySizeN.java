package day4;

import java.util.Scanner;

public class ArraySizeN
{
    public static void main(final String[] args) {
        System.out.println("Enter the length/size of the array:");
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] a = new int[n];
        System.out.println("the length of the array is: " + a.length);
        for (int i = 0; i <= a.length - 1; ++i) {
            System.out.println("Enter the marks of the students");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= a.length - 1; ++i) {
            System.out.print(String.valueOf(a[i]) + " ");
        }
    }
}