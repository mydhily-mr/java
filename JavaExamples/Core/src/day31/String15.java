package day31;

public class String15
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer("Malayalam");
        System.out.println(s1);
        final StringBuffer s2 = new StringBuffer(s1.reverse());
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("String is  palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}