package day29;

public class StringNcp2
{
    public static void main(final String[] args) {
        final String s1 = new String("sagar");
        final String s2 = new String("sagar");
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}