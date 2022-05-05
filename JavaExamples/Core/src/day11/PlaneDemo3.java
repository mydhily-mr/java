package day11;

public class PlaneDemo3
{
    public static void main(final String[] args) {
        Plane ref = new Plane();
        ref = new CargoPlane();
        ref.fly();
        ref.land();
        ref.takeoff();
        ((CargoPlane)ref).CarryCargo();
    }
}