package day17;

interface InRule1
{
    void add();
}

class Calculator implements InRule1
{
    @Override
    public void add() {
        final int a = 10;
        final int b = 20;
        final int c = a + b;
        System.out.println(c);
    }
}