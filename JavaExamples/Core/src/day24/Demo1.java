//consider ChildThread & Demo1
package day24;

class Demo1
{
    public static void main(final String[] args) {
        final ChildThread ct = new ChildThread();
        ct.start();
        ct.setPriority(10);
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Main Thread");
        }
        System.out.println(ct.getPriority());
    }
}