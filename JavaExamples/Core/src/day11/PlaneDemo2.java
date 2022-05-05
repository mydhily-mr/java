package day11;

public class PlaneDemo2
{
    public static void main(final String[] args) {
        final Plane ref = new Plane();
        final CargoPlane cp = new CargoPlane();
        final PassengerPlane pp = new PassengerPlane();
        final FighterPlane fp = new FighterPlane();
        final Airport a = new Airport();
        a.allow(cp);
        a.allow(pp);
        a.allow(fp);
    }
}