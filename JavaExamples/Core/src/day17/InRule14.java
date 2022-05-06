package day17;

interface InRule14
{
    void add();
}

interface calculate14
{
    void sub();
}

interface calculates extends InRule14, calculate14
{
    void mul();
}

class Test14 implements calculates
{
    public void add() {
        final int a = 30;
        final int b = 11;
        final int c = a + b;
        System.out.println(c);
    }
    
    public void sub() {
        final int a = 20;
        final int b = 5;
        final int c = a - b;
        System.out.println(c);
    }
    
    public void mul() {
        final int a = 43;
        final int b = 45;
        final int c = a * b;
        System.out.println(c);
    }
}
