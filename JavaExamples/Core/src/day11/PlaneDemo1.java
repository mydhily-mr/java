package day11;

public class PlaneDemo1
{
    public static void main(final String[] args) {
        Plane ref = new Plane();
        ref = new CargoPlane();
        ref.takeoff();
        ref.fly();
        ref.land();
        ref = new PassengerPlane();
        ref.takeoff();
        ref.fly();
        ref.land();
        ref = new FighterPlane();
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}