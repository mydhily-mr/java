package day3;

public class SwitchWithoutBreak
{
    public static void main(final String[] args) {
        final int iii = 5;
        switch (iii) {
            case 1: {
                System.out.println("one");
            }
            case 5: {
                System.out.println("five");
            }
            case 10: {
                System.out.println("ten");
            }
            case 20: {
                System.out.println("Twenty");
                break;
            }
        }
        System.out.println("Default");
    }
}