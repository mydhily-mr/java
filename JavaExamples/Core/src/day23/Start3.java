package day23;

class Start3 extends Thread
{
    @Override
    public void start() {
        super.start();
        System.out.println("start method");
    }
    
    @Override
    public void run() {
        System.out.println("run method");
    }
}