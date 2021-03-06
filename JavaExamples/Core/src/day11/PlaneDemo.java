package day11;

public class PlaneDemo
{
    public static void main(final String[] args) {
        final CargoPlane cp = new CargoPlane();
        final PassengerPlane pp = new PassengerPlane();
        final FighterPlane fp = new FighterPlane();
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.CarryCargo();
        pp.takeoff();
        pp.fly();
        pp.land();
        pp.CarryPassenger();
        fp.takeoff();
        fp.fly();
        fp.land();
        fp.CarryArms();
    }
}
