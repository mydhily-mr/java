package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EHDemo1
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value A");
            final int a = sc.nextInt();
            System.out.println("Enter the value B");
            final int b = sc.nextInt();
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Learn Maths...!");
        }
        catch (InputMismatchException e2) {
            System.out.println("Please enter valid inputs");
        }
        catch (Exception e3) {
            System.out.println("Invalid");
        }
    }
}