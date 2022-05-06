package day32;

public class SwapStringWithoutVariable
{
    public static void main(final String[] args) {
        String a = "Study";
        String b = "Online";
        System.out.println("Before swap: " + a + " " + b);
        a = String.valueOf(a) + b;
        System.out.println("step 2 :" + a);
        b = a.substring(0, a.length() - b.length());
        System.out.println("step 3 :" + b);
        a = a.substring(b.length());
        System.out.println("step 4 :" + a);
        System.out.println("After swap : " + a + " " + b);
    }
}