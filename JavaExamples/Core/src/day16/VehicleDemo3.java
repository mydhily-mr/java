package day16;

class VehicleDemo3
{
    public static void main(final String[] args) {
        final Vehicle V = new Vehicle();
        final Car C = new Car();
        final Bike B = new Bike();
        V.Move();
        V.Start();
        C.Move();
        C.Start();
        B.Move();
        B.Start();
    }
}