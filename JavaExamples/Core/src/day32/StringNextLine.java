package day32;

import java.util.Scanner;

public class StringNextLine
{
    public static void main(final String[] args) {
        System.out.println("enter your name:");
        final Scanner sc = new Scanner(System.in);
        final String s = sc.nextLine();
        System.out.println("the entered name is :" + s);
    }
}
