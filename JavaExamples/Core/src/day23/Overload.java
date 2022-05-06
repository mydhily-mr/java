package day23;

class Overload extends Thread
{
    @Override
    public void run() {
        System.out.println("no-parameter");
    }
    
    public void run(final int i) {
        System.out.println("one-parameter");
    }
}