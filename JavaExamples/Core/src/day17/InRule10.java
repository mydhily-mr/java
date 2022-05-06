package day17;

interface InRule10
{
    void add();
}

interface calculate10
{
    void add();
}

class calculator10 implements InRule10, calculate10
{
    @Override
    public void add() {
        final int a = 40;
        final int b = 50;
        final int c = a + b;
        System.out.println(c);
    }
}