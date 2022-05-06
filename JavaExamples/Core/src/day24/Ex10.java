package day24;

class Ex10 extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}