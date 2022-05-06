package day29;

public class String4
{
    public static void main(final String[] args) {
        final String s1 = new String("sagar");
        final String s2 = new String("sagar");
        final String s3 = "sagar";
        final String s4 = "sagar";
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
    }
}