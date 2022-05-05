package day7;

public class Returnarray
{
    public static void main(final String[] args) {
        final ArrayReturn ar = new ArrayReturn();
        final int[] x = ar.fun();
        for (int i = 0; i <= x.length - 1; ++i) {
            System.out.println(x[i]);
        }
    }
}