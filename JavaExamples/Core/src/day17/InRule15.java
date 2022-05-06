package day17;

interface InRule15
{
    void add();
}

interface calculate15 extends InRule15
{
    void sub();
}

class calculator15 implements calculate15
{
    @Override
    public void add() {
        final int a = 100;
        final int b = 25;
        final int c = a + b;
        System.out.println(c);
    }
    
    @Override
    public void sub() {
        final int a = 100;
        final int b = 30;
        final int c = b - a;
        System.out.println(c);
    }
}