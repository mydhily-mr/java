package day4;

public class IncDec6
{
    public static void main(final String[] args) {
        int a = 55;
        System.out.println(a);
        System.out.println(--a + --a - ++a + --a - ++a + ++a - ++a - a++);
        System.out.println(a);
    }
}