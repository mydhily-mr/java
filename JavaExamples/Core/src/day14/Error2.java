package day14;

public class Error2
{
    public static void main(final String[] args) {
        fun1();
    }
    
    static void fun1() {
        System.out.println("Inside fun1");
        fun1();
    }
}