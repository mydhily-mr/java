package day24;

class Ex5
{
    public Ex5() {
    }
    
    public static void main(final String[] args) {
        final ThreadGroup tg = new ThreadGroup("Online Java Classes");
        final Runnable r = new Thread();
        final Thread t = new Thread(tg, r);
        System.out.println(t);
    }
}