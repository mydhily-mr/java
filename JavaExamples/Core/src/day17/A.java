package day17;

interface A
{
    public static final int i = 100;
}

interface B
{
    public static final int i = 200;
}

interface C extends A, B
{
}

class Test1
{
    public void disp() {
        System.out.println(A.i);
        System.out.println(B.i);
    }
}