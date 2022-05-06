//consider ChildThread3 & Demo3

package day24;

class Demo3
{
    public static void main(final String[] args) {
        final Thread t = Thread.currentThread();
        t.setPriority(10);
        final ChildThread3 ct = new ChildThread3();
        System.out.println(t.getPriority());
        System.out.println(ct.getPriority());
    }
}
