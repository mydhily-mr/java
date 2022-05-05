package day9;

class Demoo
{
    Demoo() {
        System.out.println("inside the first instance block");
        System.out.println("inside the second instance block");
        System.out.println("inside the third instance block");
        System.out.println("inside the default constructor");
    }
    
    Demoo(final int x) {
        this();
        System.out.println("inside the parametrized constructor");
    }
}