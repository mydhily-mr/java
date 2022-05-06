package day17;

interface InRule13
{
    void add();
    
    void sub();
}

interface calculate13
{
    void mul();
}

abstract class calculator13 implements InRule13, calculate13
{
    @Override
    public void add() {
        final int a = 70;
        final int b = 60;
        final int c = a + b;
        System.out.println(c);
    }
    
    @Override
    public abstract void sub();
    
    @Override
    public abstract void mul();
}

class juniorCalculator extends calculator13
{
    public void sub() {
        final int a = 70;
        final int b = 60;
        final int c = a - b;
        System.out.println(c);
    }
    
    public void mul() {
        final int a = 70;
        final int b = 60;
        final int c = a * b;
        System.out.println(c);
    }
}