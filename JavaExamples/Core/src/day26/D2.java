package day26;

class D2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println("Child thread[Daemon thread]");
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException ex) {}
        }
    }
}