package day17;

class InCalculate6Demo
{
    public static void main(final String[] args) {
        final InCalculate6 c1;
        final Calculators cal = (Calculators)(c1 = new Calculators());
        c1.add();
        c1.sub();
        ((Calculators)c1).mul();
    }
}