package day29;

import java.io.Serializable;

class KTM1 extends Bike1 implements Serializable
{
    int j;
    
    KTM1() {
        this.j = 20;
        System.out.println("KTM constructor...!");
    }
}
