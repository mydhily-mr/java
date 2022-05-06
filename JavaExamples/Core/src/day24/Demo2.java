//consider ChildThread1 & Demo2

package day24;

class Demo2
{
    public static void main(final String[] args) {
        final Thread t = Thread.currentThread();
        final ChildThread1 ct = new ChildThread1();
        t.setPriority(10);
        System.out.println(t.getPriority());
        System.out.println(ct.getPriority());
    }
}
