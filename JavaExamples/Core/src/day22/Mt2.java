//consider Mt1, Mt2, MtDemo

package day22;

public class Mt2 extends Thread
{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; ++i) {
                Thread.sleep(4000L);
                System.out.println("double_num" + i * 2);
            }
        }
        catch (InterruptedException ex) {}
    }
}