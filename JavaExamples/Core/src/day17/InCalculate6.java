package day17;

interface InCalculate6
{
    void add();
    
    void sub();
}

class Calculators implements InCalculate6
{
    public void add() {
        final int a = 10;
        final int b = 20;
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
        final int a = 10;
        final int b = 20;
        final int c = a * b;
        System.out.println(c);
    }
}
