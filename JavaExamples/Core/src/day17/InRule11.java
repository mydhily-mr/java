package day17;

interface InRule11
{
    void add();
}

interface calculate11
{
    void add(final int p0, final int p1);
}

class calculator11 implements InRule11, calculate11
{
    @Override
    public void add() {
        final int a = 100;
        final int b = 120;
        final int c = a + b;
        System.out.println(c);
    }
    
    @Override
    public void add(final int a, final int b) {
        final int c = a + b;
        System.out.println(c);
    }
}