package day11;

class Airport
{
    void allow(final Plane ref) {
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}