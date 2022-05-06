package day30;

public class String14
{
    public static void main(final String[] args) {
        final String s1 = "sagar";
        final String s2 = new String("sagar");
        final String s3 = s2.intern();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}
