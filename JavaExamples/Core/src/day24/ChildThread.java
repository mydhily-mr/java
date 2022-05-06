//consider ChildThread & Demo1
package day24;

class ChildThread extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Child Thread");
        }
    }
}