package day31;

public class String6
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer("sagar");
        final StringBuffer s2 = new StringBuffer("sagar");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}