package day31;

public class String13
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer("Study Online");
        System.out.println(s1);
        s1.delete(1, 5);
        System.out.println(s1);
    }
}