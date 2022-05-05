package day9;

class A1
{
    A1() {
        this("ramu");
        System.out.println("inside default constructor");
    }
    
    A1(final int x) {
        this();
        System.out.println("inside parametrized constructor");
    }
    
    A1(final String s) {
        System.out.println("inside String parametrized constructor");
    }
}