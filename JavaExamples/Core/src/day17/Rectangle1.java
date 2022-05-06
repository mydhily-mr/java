package day17;

import java.util.Scanner;

class Rectangle1 extends Shape
{
    float breadth;
    
    public void input() {
        final Scanner s = new Scanner(System.in);
        System.out.println("enter the length of rectangle1: ");
        this.length = s.nextFloat();
        System.out.println("enter the breadth of rectangle1: ");
        this.breadth = s.nextFloat();
    }
    
    public void compute() {
        this.area = this.length * this.breadth;
    }
    
    public void disp() {
        System.out.println("the area of the rectangle1 is :" + this.area);
    }
}