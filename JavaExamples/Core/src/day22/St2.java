//consider St1,St2,StDemo

package day22;

class St2
{
    public void double_num() throws InterruptedException {
        for (int i = 0; i < 5; ++i) {
            Thread.sleep(2000L);
            System.out.println("double_num" + i * 2);
        }
    }
}