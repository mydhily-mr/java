package day7;

public class SettersGetters
{
    public static void main(final String[] args) {
        final Credentials c = new Credentials();
        c.setUn("TNS India Foundation");
        c.setPwd("3443");
        System.out.println(c.getUn());
        System.out.println(c.getPwd());
    }
}
