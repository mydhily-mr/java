package day3;

public class SwitchStatements
{
    public static void main(final String[] args) {
        final int iii = 20;
        switch (iii) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 5: {
                System.out.println("five");
                break;
            }
            case 10: {
                System.out.println("ten");
                break;
            }
            case 20: {
                System.out.println("Twenty");
                break;
            }
            default: {
                System.out.println("Default");
                break;
            }
        }
    }
}