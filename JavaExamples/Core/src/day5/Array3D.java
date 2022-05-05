package day5;

import java.util.Scanner;

public class Array3D
{
    public static void main(final String[] args) {
        final int[][][] a = new int[2][3][3];
        final Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= a.length - 1; ++i) {
            for (int j = 0; j <= a[i].length - 1; ++j) {
                for (int k = 0; k <= a[i][j].length - 1; ++k) {
                    System.out.println("Enter the marks of student " + k + " of the classroom " + j + " from the school " + i);
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i <= a.length - 1; ++i) {
            for (int j = 0; j <= a[i].length - 1; ++j) {
                for (int k = 0; k <= a[i][j].length - 1; ++k) {
                    System.out.print(String.valueOf(a[i][j][k]) + " ");
                }
                System.out.println(" ");
            }
        }
    }
}