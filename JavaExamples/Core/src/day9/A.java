package day9;

class A
{
    A() {
        System.out.println("inside user defined default constructor");
    }
    
    A(final int x) {
        this();
        System.out.println("inside parametrized constructor");
    }
}