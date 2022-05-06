package day31;

public class String7
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer();
        System.out.println(s1);
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.append("students");
        System.out.println(s1);
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.append(" prepare for exams");
        System.out.println(s1);
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.append("and get placed in a good company.");
        System.out.println(s1);
        System.out.println(s1.capacity());
        System.out.println(s1.length());
    }
}