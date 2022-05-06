package day17;

interface InRule2
{
    void add();
    
    void mul();
}

abstract class Calculator2 implements InRule2
{
    @Override
    public void add() {
        final int a = 10;
        final int b = 20;
        final int c = a + b;
        System.out.println(c);
    }
    
    @Override
    public abstract void mul();
}