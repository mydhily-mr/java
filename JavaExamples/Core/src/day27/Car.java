//consider Car & SerializeDemo

package day27;

import java.io.Serializable;

class Car implements Serializable
{
    int i;
    int j;
    
    Car() {
        this.i = 10;
        this.j = 20;
    }
}