package day2;

public class WrapperClasses
{
    public static void main(final String[] args) {
        System.out.println("-128----->127");
        System.out.println("-32768---->32767");
        System.out.println("-2147483648----->2147483647");
        System.out.println("-9223372036854775808----->9223372036854775807");
        System.out.println("1.4E-45----->3.4028235E38");
        System.out.println("4.9E-324----->1.7976931348623157E308");
        System.out.println("\u0000----->\uffff");
    }
}