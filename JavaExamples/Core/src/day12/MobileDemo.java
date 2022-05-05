package day12;

public class MobileDemo
{
    public static void main(final String[] args) {
        Mobile m = new Mobile();
        final Charger c1 = new Charger("samsung charger", "white");
        m.hasA(c1);
        m = null;
        System.out.println(c1.getbrand());
        System.out.println(c1.getcolor());
    }
}