package day4;

import java.io.PrintStream;

public class IncDec4
{
    public static void main(final String[] args) {
        int a = 15;
        System.out.println(a);
        final PrintStream out = System.out;
        final int n = a;
        final int n2 = ++a;
        --a;
        out.println(n - n2);
        System.out.println(a);
    }
}