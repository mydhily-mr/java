package day11;

class FighterPlane extends Plane
{
    @Override
    void fly() {
        System.out.println("Fighter plane is flying with high speed");
    }
    
    void CarryArms() {
        System.out.println("Fighter plane is carrying the weapons");
    }
}