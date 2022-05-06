package day33;

public class LambdaSingleParameter
{
    public static void main(final String[] args) {
        final Sayable1 s1 = name -> "Hello, " + name;
        System.out.println(s1.say("Sona"));
        final Sayable1 s2 = name -> "Hello..." + name;
        System.out.println(s2.say("everyone"));
    }
}