package day29;

public class StringNcp3
{
    public static void main(final String[] args) {
        final String s1 = new String("sagar");
        final String s2 = new String("SAGAR");
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}