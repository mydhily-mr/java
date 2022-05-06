package day31;

public class String8
{
    public static void main(final String[] args) {
        final StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity());
        s1.ensureCapacity(1500);
        System.out.println(s1.capacity());
    }
}