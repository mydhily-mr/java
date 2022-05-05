package day5;

import java.util.Scanner;

public class Jaggered2Darrays
{
    public static void main(final String[] args) {
        final int[][] a = { new int[3], new int[2], new int[4] };
        final Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= a.length - 1; ++i) {
            for (int j = 0; j <= a[i].length - 1; ++j) {
                System.out.println("Enter the marks of student " + j + "of classroom " + i);
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= a.length - 1; ++i) {
            for (int j = 0; j <= a[i].length - 1; ++j) {
                System.out.print(String.valueOf(a[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }
}