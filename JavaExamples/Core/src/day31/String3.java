package day31;

public class String3
{
    public static void main(final String[] args) {
        final String s1 = "abhilash";
        final String s2 = "asha";
        final int res = s1.compareTo(s2);
        if (res == 0) {
            System.out.println("Strings are equal");
        }
        else if (res > 0) {
            System.out.println("String s1 is greater than string s2");
        }
        else {
            System.out.println("String s1 is lesser than string s2");
        }
    }
}