package day24;

class Ex6
{
    public Ex6() {
    }
    
    public static void main(final String[] args) {
        final ThreadGroup tg = new ThreadGroup("STUDY ONLINE");
        final Runnable r = new Thread();
        final Thread t = new Thread(tg, r, "java_course");
        System.out.println(t);
    }
}