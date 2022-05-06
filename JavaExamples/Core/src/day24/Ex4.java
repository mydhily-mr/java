package day24;

class Ex4
{
    public Ex4() {
    }
    
    public static void main(final String[] args) {
        final Runnable r = new Thread();
        final Thread t = new Thread(r, "Ex4");
        System.out.println(t);
    }
}