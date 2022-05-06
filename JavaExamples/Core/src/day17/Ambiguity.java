package day17;

interface Ambiguity
{
    public static final int min = 10;
}

interface calculate123
{
    public static final int min = 20;
}

class Test implements Ambiguity, calculate123
{
    public void disp() {
        System.out.println(Ambiguity.min);
        System.out.println(calculate123.min);
    }
}
