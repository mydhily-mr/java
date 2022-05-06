package day33;

interface Addable
{
    int add(final int p0, final int p1);
}

public class LambdaMultipleParameter
{
    public static void main(final String[] args) {
        final Addable ad1 = (a, b) -> a + b;
        System.out.println(ad1.add(10, 20));
        final Addable ad2 = (a, b) -> a + b;
        System.out.println(ad1.add(100, 200));
    }
}