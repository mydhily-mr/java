package day23;

class Ex7 implements Runnable
{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; ++i) {
                Thread.sleep(2000L);
                System.out.println("db_num: " + i * 2);
            }
        }
        catch (InterruptedException ex) {}
    }
}