package day7;

class Test
{
    void swap(int x, int y) {
        final int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping : ");
        System.out.println("The value of a is:" + x);
        System.out.println("The value of b is:" + y);
    }
}