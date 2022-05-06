package day34;

interface Addable
{
    int add(final int p0, final int p1);
}

public class LambdaReturn
{
    public static void main(final String[] args) {
        final Addable ad1 = (a, b) -> a + b;
        System.out.println(ad1.add(100, 20));
        final Addable ad2 = (a, b) -> a + b;
        System.out.println(ad1.add(200, 300));
    }
}