package day23;

class Example6 extends Thread
{
    @Override
    public void run() {
        System.out.println("run method is executed by : " + Thread.currentThread().getName());
    }
}
