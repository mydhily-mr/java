package day31;

public class String11
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer("sagar");
        System.out.println(s1);
        System.out.println(s1.charAt(2));
        s1.setCharAt(2, 'p');
        System.out.println(s1);
        s1.deleteCharAt(2);
        System.out.println(s1);
    }
}
