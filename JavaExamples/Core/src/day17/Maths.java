//consider Shape & Maths

package day17;

class Maths
{
    public static void main(final String[] args) {
        final Square1 sobj = new Square1();
        final Rectangle1 robj = new Rectangle1();
        final Solve1 s12 = new Solve1();
        s12.allow(sobj);
        s12.allow(robj);
    }
}