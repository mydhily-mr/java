package day9;

public class IB
{
    int register_number;
    
    IB() {
        System.out.println("WELCOME TO Java Classes");
        this.register_number = 20;
        System.out.println("your registration number is :" + this.register_number);
    }
    
    IB(final int x) {
        System.out.println("WELCOME TO Java Classes");
        this.register_number = x;
        System.out.println("your registration number is :" + this.register_number);
    }
}