package day32;

public class ArrayToString
{
    public static void main(final String[] args) {
        final char[] c = { 's', 't', 'u', 'd', 'y' };
        final String s1 = String.valueOf(c);
        System.out.println(s1);
        final String s2 = new String(c);
        System.out.println(s2);
    }
}