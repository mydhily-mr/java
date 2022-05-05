package day16;

import day16.Pigeon.Eagle;

abstract class AbsRule2
{
    abstract void fly();
    
    abstract void eat();
}

class Pigeon extends AbsRule2
{
    @Override
    void fly() {
        System.out.println("Pigeon fly very low");
    }
    
    @Override
    void eat() {
        System.out.println("Pigeon eats grains");
    }
    
    abstract class Eagle extends AbsRule2
    {
        @Override
        void fly() {
            System.out.println("Eagle fly very high");
        }
        
        @Override
        abstract void eat();
    }
    
    class GoldenEagle extends Eagle
    {
        @Override
        void eat() {
            System.out.println("Golden Eagles hunt and eat over oceans");
        }
    }
}