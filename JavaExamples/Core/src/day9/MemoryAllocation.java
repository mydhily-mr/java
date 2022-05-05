package day9;

public class MemoryAllocation
{
    float f;
    
    MemoryAllocation() {
        System.out.println("inside the instance block");
        this.f = 12.14f;
        System.out.println("inside the constructor");
    }
    
    void fun() {
        System.out.println("inside the instance method");
    }
}