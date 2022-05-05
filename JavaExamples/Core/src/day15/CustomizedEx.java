package day15;

import java.util.Scanner;

class CustomizedEx
{
    public static void main(final String[] args) {
        System.out.println("Welcome to grade checking app...!");
        System.out.println("Enter your total percentage: ");
        final Scanner sc = new Scanner(System.in);
        final int percentage = sc.nextInt();
        if (percentage >= 75) {
            throw new DistinctionException("Distincion....Congrats");
        }
        if (percentage >= 60) {
            throw new FirstClassException("First class....Still you have scope to improve");
        }
        if (percentage >= 35) {
            throw new SecondClassException("Second class....Workhard to get good marks");
        }
        System.out.println("Fail....Better luck next time");
    }
}