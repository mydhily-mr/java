//consider Car4 & SerializeDemo4

package day28;

import java.io.Serializable;

class Car4 implements Serializable
{
    Bike4 b = new Bike4();;
    
}

class Bike4 implements Serializable
{
    Truck4 t = new Truck4();
    
}

class Truck4 implements Serializable
{
    int i=20;
    
}