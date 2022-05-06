package day29;

public class String3
{
    public static void main(final String[] args) {
        final String s1 = "sagar";
        final String s2 = "sagar";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}