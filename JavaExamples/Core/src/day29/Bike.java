//consider Bike & SerializeDemo

package day29;

import java.io.Serializable;

class Bike
{
    int i;
    
    Bike() {
        this.i = 10;
    }
}

class KTM extends Bike implements Serializable
{
    int j;
    
    KTM() {
        this.j = 20;
    }
}