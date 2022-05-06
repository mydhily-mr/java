package day24;

class Ex10Demo
{
    public static void main(final String[] args) {
        final Ex10 t1 = new Ex10();
        final Ex10 t2 = new Ex10();
        final Ex10 t3 = new Ex10();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}