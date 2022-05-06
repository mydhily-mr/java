//consider Bike & SerializeDemo

package day29;

import java.io.Serializable;

class Bike1 implements Serializable
{
    int i;
    
    Bike1() {
        this.i = 10;
        System.out.println("Bike constructor...!");
    }
}
