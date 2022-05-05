package day16;

abstract class AbsVehicle
{
    void Move() {
        System.out.println("Vehicle is moving");
    }
    
    abstract void Start();
    
    class Car1 extends AbsVehicle
    {
        @Override
        void Start() {
            System.out.println("Self start or auto start");
        }
    }
    
    class Bike1 extends AbsVehicle
    {
        @Override
        void Start() {
            System.out.println("Kick start");
        }
    }
}