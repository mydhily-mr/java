package day23;

class Example7 implements Runnable
{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; ++i) {
                Thread.sleep(2000L);
                System.out.println("sq_num: " + i * i);
            }
        }
        catch (InterruptedException ex) {}
    }
}