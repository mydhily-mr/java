package day16;

abstract class Remote
{
    abstract void On();
    
    abstract void Off();
}

class Tv extends Remote
{
    @Override
    void On() {
        System.out.println("The tv is on");
    }
    
    @Override
    void Off() {
        System.out.println("The tv is off");
    }
}