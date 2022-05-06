package day30;

public class String13
{
    public static void main(final String[] args) {
        final String s1 = new String("sagar");
        final String s2 = s1.intern();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}