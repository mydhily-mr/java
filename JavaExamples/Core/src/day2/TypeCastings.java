package day2;

public class TypeCastings
{
    public static void main(final String[] args) {
        final int i;
        final byte b = (byte)(i = 10);
        System.out.println(String.valueOf(b) + " " + i);
        final char c = 'A';
        final int z;
        final char d = (char)(z = 65);
        System.out.println(String.valueOf(d) + " " + z);
        final long l = 10L;
        final float f = (float)l;
        System.out.println(String.valueOf(l) + " " + f);
        final int j = 10;
        final byte by = (byte)j;
        System.out.println(String.valueOf(j) + " " + by);
        final int k = 130;
        final byte m = (byte)i;
        System.out.println(String.valueOf(k) + " " + m);
    }
}