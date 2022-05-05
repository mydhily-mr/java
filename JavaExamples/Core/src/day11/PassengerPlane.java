package day11;

class PassengerPlane extends Plane
{
    @Override
    void fly() {
        System.out.println("Passenger plane is flying with medium speed");
    }
    
    void CarryPassenger() {
        System.out.println("Passenger plane is carrying the people");
    }
}
