package day31;

public class String12
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer("sagar");
        System.out.println(s1);
        s1.insert(2, " sagar is a good boy..!");
        System.out.println(s1);
        s1.insert(0, 678);
        System.out.println(s1);
    }
}

