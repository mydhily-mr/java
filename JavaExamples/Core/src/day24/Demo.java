package day24;

class Demo
{
    public static void main(final String[] args) {
        final Demo d = new Demo();
        final Thread t = new Thread();
        System.out.println(t.getPriority());
        t.setPriority(7);
        System.out.println(t.getPriority());
        t.setPriority(8);
        System.out.println(t.getPriority());
        t.setPriority(12);
    }
}