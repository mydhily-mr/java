//consider Car1 & SerializeDemo1

package day28;

import java.io.Serializable;

class Car1 implements Serializable
{
    String username;
    final transient int pwd = 8954;
    
    Car1() {
        this.username = "Mydhily";
    }
}