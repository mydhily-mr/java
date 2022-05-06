package day29;

public class String6
{
    public static void main(final String[] args) {
        final String s1 = "sagar";
        final String s2 = "sagarram";
        final String s3 = String.valueOf(s1) + "ram";
        System.out.println(s1 == s2);
        System.out.println(s2.equals(s3));
    }
}