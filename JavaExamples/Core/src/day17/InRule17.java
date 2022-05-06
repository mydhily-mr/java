package day17;

class InRule17
{
    public void add() {
        System.out.println("inside add method");
    }
}

interface calculate17
{
    void sub();
}

class calculator17 extends InRule17 implements calculate17
{
    @Override
    public void sub() {
        System.out.println("inside sub method");
    }
}