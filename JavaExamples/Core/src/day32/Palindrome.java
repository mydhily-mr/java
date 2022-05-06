package day32;

public class Palindrome
{
    public static void main(final String[] args) {
        final String s1 = "madam";
        String rev = "";
        final int len = s1.length();
        for (int i = len - 1; i >= 0; --i) {
            rev = String.valueOf(rev) + s1.charAt(i);
        }
        System.out.println("Reversed string is :" + rev);
        if (s1.equals(rev)) {
            System.out.println("the given string is a palindrome");
        }
        else {
            System.out.println("the given string is not a palindrome");
        }
    }
}