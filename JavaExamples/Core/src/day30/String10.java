package day30;

public class String10
{
    public static void main(final String[] args) {
        final String s1 = "sagar";
        final String s2 = "sagarram";
        System.out.println(s1 == s2);
        final String s3 = new String("sagar");
        final String s4 = new String("sagarram");
        System.out.println(s3 == s4);
        System.out.println(s2.equals(s4));
        final String s5 = "sagarram";
        final String s6 = "sagarram";
        final String s7 = String.valueOf(s1) + "ram";
        System.out.println(s6 == s7);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
    }
}