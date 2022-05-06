package day24;

class Ex2
{
    public Ex2() {
    }
    
    public static void main(final String[] args) {
        final Runnable r = new Thread();
        final Thread t = new Thread(r);
        System.out.println(t);
    }
}
