//consider St1,St2,StDemo
package day22;

public class St1
{
    public void sq_num() throws InterruptedException {
        for (int i = 0; i < 5; ++i) {
            Thread.sleep(2000L);
            System.out.println("sq_num" + i * i);
        }
    }
}