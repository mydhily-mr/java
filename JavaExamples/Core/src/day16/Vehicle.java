package day16;

public class Vehicle {
    void Move() {
        System.out.println("Vehicle is moving");
    }

    void Start() {
        System.out.println("Vehicle is started");
    }
}

class Car extends Vehicle
{
    void Start() {
        System.out.println("Self start or auto start");
    }
}

class Bike extends Vehicle
{
    void Start() {
        System.out.println("Kick start");
    }
}