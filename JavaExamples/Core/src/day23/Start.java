package day23;

class Start extends Thread
{
    @Override
    public void start() {
        System.out.println("start method");
    }
    
    @Override
    public void run() {
        System.out.println("run method");
    }
}