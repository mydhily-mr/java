package day32;

public class StringToArray
{
    public static void main(final String[] args) {
        final String s1 = "StudyOnline";
        System.out.println(s1);
        final char[] a = s1.toCharArray();
        char[] array;
        for (int length = (array = a).length, i = 0; i < length; ++i) {
            final char ch = array[i];
            System.out.println(ch);
        }
    }
}