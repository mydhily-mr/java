package day17;

interface InRule6
{
    void ROI();
}

class SBI implements InRule6
{
    @Override
    public void ROI() {
        System.out.println("sbi --> 7.5%");
    }
}

class AXIS implements InRule6
{
    public void ROI() {
        System.out.println("AXIS --> 9.5%");
    }
}

class CANARA implements InRule6
{
    public void ROI() {
        System.out.println("CANARA --> 8.5%");
    }
}

class Calculate
{
    public void allow(final InRule6 ref) {
        ref.ROI();
    }
}