package day11;

public class VehicleDemo
{
    public static void main(final String[] args) {
        final Bike b = new Bike();
        final Car c = new Car();
        final Truck t = new Truck();
        b.Move();
        c.Move();
        t.Move();
    }
}
