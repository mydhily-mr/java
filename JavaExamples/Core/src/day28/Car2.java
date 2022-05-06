//consider Car2 & SerializeDemo2

package day28;

import java.io.Serializable;

class Car2 implements Serializable
{
    String username;
    final transient int pwd = 8954;
    
    Car2() {
        this.username = "Mydhily";
    }
}

class Bike implements Serializable
{
    String username;
    final transient int pwd = 5454;
    
    Bike() {
        this.username = "Mydhily M R";
    }
}

class Truck implements Serializable
{
}
