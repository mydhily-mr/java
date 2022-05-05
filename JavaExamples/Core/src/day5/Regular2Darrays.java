package day5;

import java.util.Scanner;

public class Regular2Darrays
{
    public static void main(final String[] args) {
        final int[][] a = new int[3][5];
        final Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; ++i) {
            for (int j = 0; j <= 4; ++j) {
                System.out.println("Enter the marks of student " + j + " of classroom " + i);
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= 2; ++i) {
            for (int j = 0; j <= 4; ++j) {
                System.out.print(String.valueOf(a[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }
}