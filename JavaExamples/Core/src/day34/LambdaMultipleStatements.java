package day34;

@FunctionalInterface
interface Sayable
{
    String say(final String p0);
}

public class LambdaMultipleStatements
{
    public static void main(final String[] args) {
        final Sayable person = message -> {
            final String str1 = " I would like to say, ";
            final String str2 = String.valueOf(str1) + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
