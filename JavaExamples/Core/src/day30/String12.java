package day30;

public class String12
{
    public static void main(final String[] args) {
        final String s1 = new String("study online");
        final String s2 = new String("STUDY ONLINE");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1.startsWith("stu"));
        System.out.println(s2.endsWith("INE"));
        System.out.println(s1.contains("dyon"));
        System.out.println(s1.indexOf("y"));
        System.out.println(s1.charAt(4));
    }
}