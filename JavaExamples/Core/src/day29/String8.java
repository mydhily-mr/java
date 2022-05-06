package day29;

public class String8
{
    public static void main(final String[] args) {
        String s1 = "sagar";
        final String s2 = "sagarram";
        final String s3 = "sagar";
        s1.concat(s3);
        s1 = String.valueOf(s1) + "kumar";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s3);
    }
}