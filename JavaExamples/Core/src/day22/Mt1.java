//consider Mt1, Mt2, MtDemo
package day22;

public class Mt1 extends Thread
{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; ++i) {
                Thread.sleep(4000L);
                System.out.println("sq_num" + i * i);
            }
        }
        catch (InterruptedException ex) {}
    }
}