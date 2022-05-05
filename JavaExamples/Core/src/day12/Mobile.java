package day12;

public class Mobile
{
    OS o;
    
    public Mobile() {
        this.o = new OS("android", 125);
    }
    
    public void hasA(final Charger c) {
        System.out.println(c.getbrand());
        System.out.println(c.getcolor());
    }
}