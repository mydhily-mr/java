package day32;

public class StringReverse
{
    public static void main(final String[] args) {
        final String s1 = "hello";
        String rev = "";
        final int len = s1.length();
        for (int i = len - 1; i >= 0; --i) {
            rev = String.valueOf(rev) + s1.charAt(i);
        }
        System.out.println("Reversed string is :" + rev);
    }
}