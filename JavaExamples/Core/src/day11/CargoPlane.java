package day11;

class CargoPlane extends Plane
{
    @Override
    void fly() {
        System.out.println("Cargoplane is flying with low speed");
    }
    
    void CarryCargo() {
        System.out.println("Cargoplane is carrying the goods");
    }
}