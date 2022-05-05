package day11;

public class VehicleDemo1
{
    public static void main(final String[] args) {
        Vehicle v = new Vehicle();
        v = new Bike();
        v.Move();
        v = new Car();
        v.Move();
        v = new Truck();
        v.Move();
    }
}