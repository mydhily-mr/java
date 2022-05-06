package day29;

public class StringNcp1
{
    public static void main(final String[] args) {
        final String s1 = new String("sagar");
        final String s2 = new String("sagar");
        if (s1 == s2) {
            System.out.println("reference are equal");
        }
        else {
            System.out.println("reference are not equal");
        }
    }
}