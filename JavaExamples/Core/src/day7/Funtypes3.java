package day7;

public class Funtypes3
{
    public static void main(final String[] args) {
        final Addition3 a1 = new Addition3();
        final int x = 12;
        final int y = 10;
        final int result = a1.add(x, y);
        System.out.println(result);
        a1.add(x, y);
    }
}