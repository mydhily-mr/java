package day17;

interface InRule9
{
    void add();
}

interface calculate2
{
    void sub();
}

class calculator9 implements InRule9, calculate2
{
    @Override
    public void add() {
        final int a = 10;
        final int b = 15;
        final int c = a + b;
        System.out.println(c);
    }
    
    @Override
    public void sub() {
        final int a = 20;
        final int b = 3;
        final int c = a - b;
        System.out.println(c);
    }
}