package day17;

class InRule6Demo
{
    public static void main(final String[] args) {
        final SBI s = new SBI();
        final AXIS a = new AXIS();
        final CANARA c = new CANARA();
        final Calculate c2 = new Calculate();
        c2.allow((InRule6)s);
        c2.allow(a);
        c2.allow(c);
    }
}

