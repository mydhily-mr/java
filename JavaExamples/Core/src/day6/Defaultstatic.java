package day6;

public class Defaultstatic
{
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bo;
    static char ch;
    static String st;
    
    public static void main(final String[] args) {
        final Defaultstatic d1 = new Defaultstatic();
        System.out.println(Defaultstatic.b);
        System.out.println(Defaultstatic.s);
        System.out.println(Defaultstatic.i);
        System.out.println(Defaultstatic.l);
        System.out.println(Defaultstatic.f);
        System.out.println(Defaultstatic.d);
        System.out.println(Defaultstatic.bo);
        System.out.println(Defaultstatic.ch);
        System.out.println(Defaultstatic.st);
    }
}